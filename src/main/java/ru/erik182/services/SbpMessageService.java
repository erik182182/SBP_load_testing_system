package ru.erik182.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.erik182.enums.QueueDirection;
import ru.erik182.models.SbpMessage;
import ru.erik182.utils.AppUtils;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.TextMessage;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

@Service
public class SbpMessageService {

    @Autowired
    private JmsService jmsService;

    public List<SbpMessage> browseSbpMessages(QueueDirection direction) throws JMSException {
        List<Message> messages = jmsService.browseMessages(direction);
        return getSbpMessages(messages);
    }

    public List<SbpMessage> browseSbpMessages(Timestamp from, Timestamp to, QueueDirection direction) throws JMSException {
        List<Message> messages = jmsService.browseMessages(from, to, direction);
        return getSbpMessages(messages);
    }

    public SbpMessage browseSbpMessage(String messageId, QueueDirection direction) throws JMSException {
        Message message = jmsService.browseMessage(messageId, direction);
        return getSbpMessage(message);
    }

    public List<SbpMessage> browseSbpMessagesByPriority(QueueDirection direction) throws JMSException {
        List<Message> messages = jmsService.browseMessagesSortedByPriority(direction);
        return getSbpMessages(messages);
    }

    public List<SbpMessage> browseSbpMessagesByPriority(Timestamp from, Timestamp to, QueueDirection direction) throws JMSException {
        List<Message> messages = jmsService.browseMessagesSortedByPriority(from, to, direction);
        return getSbpMessages(messages);
    }

    public List<SbpMessage> consumeSbpMessages(QueueDirection direction) throws JMSException {
        List<Message> messages = jmsService.consumeMessages(direction);
        return getSbpMessages(messages);
    }

    private SbpMessage getSbpMessage(Message message) throws JMSException {
        if (message == null) {
            return null;
        }
        return SbpMessage.builder()
                .content(AppUtils.decodeBase64(((TextMessage) message).getText().trim()))
                .timestamp(new Timestamp(message.getJMSTimestamp()))
                .priority(message.getJMSPriority())
                .messageId(message.getJMSMessageID().trim())
                .userId(message.getStringProperty("JMSXUserID").trim())
                .appId(message.getStringProperty("JMSXAppID").trim())
                .format(message.getStringProperty("JMS_IBM_Format").trim())
                .characterSet(message.getStringProperty("JMS_IBM_Character_Set").trim())
                .encoding(message.getStringProperty("JMS_IBM_Encoding").trim())
                .build();
    }

    private List<SbpMessage> getSbpMessages(List<Message> messages) throws JMSException {
        List<SbpMessage> result = new ArrayList<>();
        for (Message m : messages) {
            result.add(getSbpMessage(m));
        }
        ;
        return result;
    }
}
