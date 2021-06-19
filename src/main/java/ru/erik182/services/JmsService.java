package ru.erik182.services;

import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import ru.erik182.enums.QueueDirection;
import ru.erik182.utils.AppUtils;

import javax.jms.*;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

@Service
public class JmsService {

    @Autowired
    private Session session;

    @Value("${mq.queue.in}")
    private String inQueueName;
    @Value("${mq.queue.out}")
    private String outQueueName;

    public List<Message> browseMessages(QueueDirection direction) throws JMSException {
        QueueBrowser browser = null;
        if (direction.equals(QueueDirection.IN)) {
            browser = session.createBrowser(session.createQueue(inQueueName));
        }
        if (direction.equals(QueueDirection.OUT)) {
            browser = session.createBrowser(session.createQueue(outQueueName));
        }
        List<Message> messages = (List<Message>) AppUtils.getListFromEnum(browser.getEnumeration());
        return messages;
    }

    public List<Message> browseMessages(Timestamp from, Timestamp to, QueueDirection direction) throws JMSException {
        List<Message> messages = browseMessages(direction);
        List<Message> result = new ArrayList<>();
        for (Message m : messages) {
            Timestamp timestamp = new Timestamp(m.getJMSTimestamp());
            if (timestamp.after(from) && timestamp.before(to)) {
                result.add(m);
            }
        }
        return result;
    }

    public Message browseMessage(String messageId, QueueDirection direction) throws JMSException {
        List<Message> messages = browseMessages(direction);
        for (Message m : messages) {
            if (m.getJMSMessageID().equals(messageId)) {
                return m;
            }
        }
        return null;
    }

    public List<Message> browseMessagesSortedByPriority(QueueDirection direction) throws JMSException {
        List<Message> messages = browseMessages(direction);
        messages.sort(new Comparator<Message>() {
            @SneakyThrows
            @Override
            public int compare(Message m1, Message m2) {
                return m1.getJMSPriority() - m2.getJMSPriority();
            }
        });
        return messages;
    }

    public List<Message> browseMessagesSortedByPriority(Timestamp from, Timestamp to, QueueDirection direction) throws JMSException {
        List<Message> messages = browseMessages(from, to, direction);
        messages.sort(new Comparator<Message>() {
            @SneakyThrows
            @Override
            public int compare(Message m1, Message m2) {
                Timestamp t1 = new Timestamp(m1.getJMSTimestamp());
                Timestamp t2 = new Timestamp(m2.getJMSTimestamp());
                if (t1.compareTo(t2) != 0) {
                    long compare = t1.getTime() - t2.getTime();
                    return (int) compare;
                }
                return m1.getJMSPriority() - m2.getJMSPriority();
            }
        });
        return messages;
    }

    public List<Message> consumeMessages(QueueDirection direction) throws JMSException {
        MessageConsumer consumer = null;
        if (direction.equals(QueueDirection.IN)) {
            consumer = session.createConsumer(session.createQueue(inQueueName));
        }
        if (direction.equals(QueueDirection.OUT)) {
            consumer = session.createConsumer(session.createQueue(outQueueName));
        }
        List<Message> messages = new ArrayList<>();
        Message message = consumer.receive();
        while (message != null) {
            messages.add(message);
            message = consumer.receive();
        }
        return messages;
    }

    public boolean produceMessages(List<Message> list, QueueDirection direction) throws JMSException {
        MessageProducer producer = null;
        if (direction.equals(QueueDirection.IN)) {
            producer = session.createProducer(session.createQueue(inQueueName));
        }
        if (direction.equals(QueueDirection.OUT)) {
            producer = session.createProducer(session.createQueue(outQueueName));
        }
        for (Message message : list) {
            producer.send(message);
        }
        return true;
    }

}
