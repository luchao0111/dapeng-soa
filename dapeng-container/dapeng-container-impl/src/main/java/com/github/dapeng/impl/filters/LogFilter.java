package com.github.dapeng.impl.filters;


import com.github.dapeng.core.Application;
import com.github.dapeng.core.SoaHeader;
import com.github.dapeng.core.TransactionContext;
import com.github.dapeng.core.filter.Filter;
import com.github.dapeng.core.filter.FilterChain;
import com.github.dapeng.core.filter.FilterContext;
import com.github.dapeng.core.helper.SoaSystemEnvProperties;
import com.github.dapeng.impl.plugins.netty.NettyChannelKeys;
import com.github.dapeng.org.apache.thrift.TException;
import io.netty.channel.ChannelHandlerContext;
import io.netty.util.Attribute;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author Ever
 * @date 2018-04-11
 */
public class LogFilter implements Filter {
    private static final Logger LOGGER = LoggerFactory.getLogger(LogFilter.class);
    private static final Map<ClassLoader, MdcCtxInfo> mdcCtxInfoCache = new ConcurrentHashMap<>(16);

    @Override
    public void onEntry(FilterContext filterContext, FilterChain next) {
        TransactionContext transactionContext = (TransactionContext) filterContext.getAttribute("context");
        Application application = (Application) filterContext.getAttribute("application");

        try {
            if (LOGGER.isTraceEnabled()) {
                LOGGER.trace(getClass().getSimpleName() + "::onEntry[seqId:" + transactionContext.getSeqid() + "]");
            }


            SoaHeader soaHeader = transactionContext.getHeader();

            String infoLog = "request[seqId:" + transactionContext.getSeqid() + "]:"
                    + "service[" + soaHeader.getServiceName()
                    + "]:version[" + soaHeader.getVersionName()
                    + "]:method[" + soaHeader.getMethodName() + "]"
                    + (soaHeader.getOperatorId().isPresent() ? " operatorId:" + soaHeader.getOperatorId().get() : "")
                    + (soaHeader.getUserId().isPresent() ? " userId:" + soaHeader.getUserId().get() : "");

            switchMdcToAppClassLoader("put", application.getAppClasssLoader(), transactionContext.sessionTid().orElse("0"));

            application.info(this.getClass(), infoLog);
        } finally {
            try {
                next.onEntry(filterContext);
            } catch (TException e) {
                LOGGER.error(e.getMessage(), e);
            } finally {
                boolean isAsync = (Boolean) filterContext.getAttribute("isAsync");
                if (isAsync) {
                    switchMdcToAppClassLoader("remove", application.getAppClasssLoader(), transactionContext.sessionTid().orElse("0"));
                }
            }
        }
    }

    @Override
    public void onExit(FilterContext filterContext, FilterChain prev) {
        TransactionContext transactionContext = (TransactionContext) filterContext.getAttribute("context");
        ChannelHandlerContext channelHandlerContext = (ChannelHandlerContext) filterContext.getAttribute("channelHandlerContext");
        Application application = (Application) filterContext.getAttribute("application");

        try {
            if (LOGGER.isTraceEnabled()) {
                LOGGER.trace(getClass().getSimpleName()
                        + "::onExit:[seqId:" + transactionContext.getSeqid()
                        + ", execption:" + transactionContext.soaException()
                        + ",\n result:" + filterContext.getAttribute("result") + "]\n");
            }

            SoaHeader soaHeader = transactionContext.getHeader();

            /**
             * use AttributeMap to share common data on different  ChannelHandlers
             */
            Attribute<Map<Integer, Long>> requestTimestampAttr = channelHandlerContext.channel().attr(NettyChannelKeys.REQUEST_TIMESTAMP);
            Map<Integer, Long> requestTimestampMap = requestTimestampAttr.get();

            Long requestTimestamp = 0L;
            if (requestTimestampMap != null) {
                //each per request take the time then remove it
                requestTimestamp = requestTimestampMap.remove(transactionContext.getSeqid());

                if (requestTimestamp == null) {
                    requestTimestamp = 0L;
                }
            } else {
                LOGGER.warn(getClass().getSimpleName() + "::encode no requestTimestampMap found!");
            }

            Long cost = System.currentTimeMillis() - requestTimestamp;
            String infoLog = "response[seqId:" + transactionContext.getSeqid() + ", respCode:" + soaHeader.getRespCode().get() + "]:"
                    + "service[" + soaHeader.getServiceName()
                    + "]:version[" + soaHeader.getVersionName()
                    + "]:method[" + soaHeader.getMethodName() + "]"
                    + (soaHeader.getOperatorId().isPresent() ? " operatorId:" + soaHeader.getOperatorId().get() : "")
                    + (soaHeader.getUserId().isPresent() ? " userId:" + soaHeader.getUserId().get() : ""
                    + " cost:" + cost + "ms");
            //异步返回
            boolean isAsync = (Boolean) filterContext.getAttribute("isAsync");
            if (isAsync) {
                switchMdcToAppClassLoader("put", application.getAppClasssLoader(), transactionContext.sessionTid().orElse("0"));
            }

            soaHeader.setCalleeTime1(cost.intValue());
            application.info(this.getClass(), infoLog);
        } finally {
            try {
                prev.onExit(filterContext);
            } catch (TException e) {
                LOGGER.error(e.getMessage(), e);
            } finally {
                switchMdcToAppClassLoader("remove", application.getAppClasssLoader(), transactionContext.sessionTid().orElse("0"));
            }
        }
    }

    /**
     * 应用的MDC辅助类
     */
    class MdcCtxInfo {
        final ClassLoader appClassLoader;
        final Class<?> mdcClass;
        final Method put;
        final Method remove;

        MdcCtxInfo(ClassLoader app, Class<?> mdcClass, Method put, Method remove) {
            this.appClassLoader = app;
            this.mdcClass = mdcClass;
            this.put = put;
            this.remove = remove;
        }
    }

    // MDC.put(key, value), MDC.remove(key)
    private void switchMdcToAppClassLoader(String methodName, ClassLoader appClassLoader, String sessionTid) {
        try {
            MdcCtxInfo mdcCtxInfo = mdcCtxInfoCache.get(appClassLoader);
            if (mdcCtxInfo == null) {
                synchronized (appClassLoader) {
                    mdcCtxInfo = mdcCtxInfoCache.get(appClassLoader);
                    if (mdcCtxInfo == null) {
                        Class<?> mdcClass = appClassLoader.loadClass(MDC.class.getName());

                        mdcCtxInfo = new MdcCtxInfo(appClassLoader,
                                mdcClass,
                                mdcClass.getMethod("put", String.class, String.class),
                                mdcClass.getMethod("remove", String.class)
                        );
                        mdcCtxInfoCache.put(appClassLoader, mdcCtxInfo);
                    }
                }
            }


            if (methodName.equals("put")) {
                mdcCtxInfo.put.invoke(mdcCtxInfo.mdcClass, SoaSystemEnvProperties.KEY_LOGGER_SESSION_TID, sessionTid);
            } else {
                mdcCtxInfo.remove.invoke(mdcCtxInfo.mdcClass, SoaSystemEnvProperties.KEY_LOGGER_SESSION_TID);
            }
        } catch (ClassNotFoundException | NoSuchMethodException
                | IllegalAccessException |
                InvocationTargetException e) {
            LOGGER.error(getClass().getSimpleName() + "::switchMdcToAppClassLoader," + e.getMessage(), e);
        }
    }

}