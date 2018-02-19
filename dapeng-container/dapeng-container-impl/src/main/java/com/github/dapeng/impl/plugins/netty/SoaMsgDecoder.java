package com.github.dapeng.impl.plugins.netty;

import com.github.dapeng.api.Container;
import com.github.dapeng.client.netty.TSoaTransport;
import com.github.dapeng.core.*;
import com.github.dapeng.core.definition.SoaFunctionDefinition;
import com.github.dapeng.core.definition.SoaServiceDefinition;
import com.github.dapeng.org.apache.thrift.TException;
import com.github.dapeng.org.apache.thrift.protocol.TProtocol;
import com.github.dapeng.org.apache.thrift.protocol.TProtocolException;
import com.github.dapeng.util.DumpUtil;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToMessageDecoder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

/**
 * @author ever
 */
public class SoaMsgDecoder extends MessageToMessageDecoder<ByteBuf> {
    private static final Logger LOGGER = LoggerFactory.getLogger(SoaMsgDecoder.class);

    private final Container container;

    SoaMsgDecoder(Container container) {
        this.container = container;
    }

    @Override
    protected void decode(ChannelHandlerContext ctx, ByteBuf msg, List out) throws Exception {
        try {
            out.add(parseSoaMsg(msg));
        } catch (SoaException e) {
            LOGGER.error(e.getMessage(), e);
            ctx.writeAndFlush(e);
        } catch (Throwable e) {
            LOGGER.error(e.getMessage(), e);
            ctx.writeAndFlush(new SoaException(SoaCode.UnKnown, e.getMessage()));
        }
    }

    private <I, REQ, RESP> REQ parseSoaMsg(ByteBuf msg) throws TException {
        TSoaTransport inputSoaTransport = new TSoaTransport(msg);
        SoaMessageProcessor parser = new SoaMessageProcessor(inputSoaTransport);

        final TransactionContext context = TransactionContext.Factory.createNewInstance();

        // parser.service, version, method, header, bodyProtocol
        SoaHeader soaHeader = parser.parseSoaMessage(context);
        context.setHeader(soaHeader);

        Application application = container.getApplication(new ProcessorKey(soaHeader.getServiceName(), soaHeader.getVersionName()));

        if (application == null) {
            throw new SoaException(SoaCode.NotMatchedService);
        }

        SoaServiceDefinition processor = container.getServiceProcessors().get(new ProcessorKey(soaHeader.getServiceName(), soaHeader.getVersionName()));

        SoaFunctionDefinition<I, REQ, RESP> soaFunction = (SoaFunctionDefinition<I, REQ, RESP>) processor.functions.get(soaHeader.getMethodName());

        if (soaFunction == null) {
            throw new SoaException(SoaCode.NotMatchedMethod);
        }

        TProtocol contentProtocol = parser.getContentProtocol();
        REQ args;
        try {
            args = soaFunction.reqSerializer.read(contentProtocol);
        } catch (TProtocolException | OutOfMemoryError e) {
            //反序列化出错
            LOGGER.error(DumpUtil.dumpToStr(msg));
            throw e;
        }
        contentProtocol.readMessageEnd();

        //log request
        application.info(this.getClass(), "{} {} {} operatorId:{} operatorName:{} request body:{}",
                soaHeader.getServiceName(), soaHeader.getVersionName(),
                soaHeader.getMethodName(), soaHeader.getOperatorId(),
                soaHeader.getOperatorName(), formatToString(soaFunction.reqSerializer.toString(args)));

        return args;
    }

    private String formatToString(String msg) {
        if (msg == null) {
            return msg;
        }

        msg = msg.indexOf("\r\n") != -1 ? msg.replaceAll("\r\n", "") : msg;

        int len = msg.length();
        int max_len = 128;

        if (len > max_len) {
            msg = msg.substring(0, 128) + "...(" + len + ")";
        }

        return msg;
    }
}
