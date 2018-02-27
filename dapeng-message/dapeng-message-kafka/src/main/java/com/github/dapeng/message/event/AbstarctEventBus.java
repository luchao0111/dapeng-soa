package com.github.dapeng.message.event;


import com.github.dapeng.message.event.dao.IMessageDao;
import com.github.dapeng.message.event.dao.SpringContextHolder;
import com.github.dapeng.message.event.serializer.KafkaMessageProcessor;
import com.github.dapeng.org.apache.thrift.TException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 描述: 抽象消息总线 基类
 *
 * @author maple.lei
 * @date 2018年02月23日 上午11:11
 */
public abstract class AbstarctEventBus {

    private Logger logger = LoggerFactory.getLogger(AbstarctEventBus.class);

    public void fireEvent(Object event) throws TException {
        try {
            dispatchEvent(event);
            persistenceEvent(event);
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
        }
    }

    /**
     * 业务系统处理事件分发逻辑
     *
     * @param event
     */
    protected abstract void dispatchEvent(Object event);

    private void persistenceEvent(Object event) throws TException {
        logger.info("prepare to save event message");

        KafkaMessageProcessor processor = new KafkaMessageProcessor<>();
        byte[] bytes = processor.buildMessageByte(event);

        IMessageDao messageDao = SpringContextHolder.getBean(IMessageDao.class);
        messageDao.saveMessageToDB(event.getClass().getName(), bytes);
        logger.info("save message successful ");
    }


}
