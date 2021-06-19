package ru.erik182.config;

import com.ibm.msg.client.jms.JmsConnectionFactory;
import com.ibm.msg.client.jms.JmsFactoryFactory;
import com.ibm.msg.client.wmq.WMQConstants;
import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.PropertiesConfiguration;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.jms.Connection;
import javax.jms.JMSException;
import javax.jms.Session;
import java.io.File;

@Configuration
public class AppConfig {

    @Value("${mq.host}")
    private String jmsHost;
    @Value("${mq.port}")
    private int jmsPort;
    @Value("${mq.channel}")
    private String jmsChannel;
    @Value("${mq.manager.name}")
    private String jmsQueueManagerName;
    @Value("${mq.queue.in}")
    private String jmsQueueInName;
    @Value("${mq.queue.out}")
    private String jmsQueueOutName;
    @Value("${mq.client.transport}")
    private boolean clientTransport;

    @Value("${jmeter.path}")
    private String jmeterPath;
    @Value("${jmeter.prop.path}")
    private String jmeterPropPath;


    @Bean
    public Connection getConnection() throws JMSException {
        JmsFactoryFactory ff;
        JmsConnectionFactory cf;
        ff = JmsFactoryFactory.getInstance(WMQConstants.WMQ_PROVIDER);
        cf = ff.createConnectionFactory();
        cf.setStringProperty(WMQConstants.WMQ_HOST_NAME, jmsHost);
        cf.setIntProperty(WMQConstants.WMQ_PORT, jmsPort);
        cf.setStringProperty(WMQConstants.WMQ_CHANNEL, jmsChannel);
        cf.setStringProperty(WMQConstants.WMQ_QUEUE_MANAGER, jmsQueueManagerName);
        if (clientTransport) {
            cf.setIntProperty(WMQConstants.WMQ_CONNECTION_MODE, WMQConstants.WMQ_CM_CLIENT);
        } else {
            cf.setIntProperty(WMQConstants.WMQ_CONNECTION_MODE, WMQConstants.WMQ_CM_BINDINGS);
        }
        Connection connection = cf.createConnection();
        connection.start();
        return connection;
    }

    @Bean
    public Session getSession() throws JMSException {
        return getConnection().createSession(false, Session.AUTO_ACKNOWLEDGE);
    }

    @Bean
    public org.apache.commons.configuration.Configuration getJMeterConfiguration() throws ConfigurationException {
        org.apache.commons.configuration.Configuration config =
                new PropertiesConfiguration(new File(jmeterPath + jmeterPropPath));
        return config;
    }
}
