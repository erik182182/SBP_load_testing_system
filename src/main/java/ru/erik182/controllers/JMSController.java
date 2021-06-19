package ru.erik182.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import ru.erik182.enums.QueueDirection;
import ru.erik182.models.SbpMessage;
import ru.erik182.services.JmsService;
import ru.erik182.services.SbpMessageService;

import javax.jms.JMSException;
import java.util.List;

@Controller
public class JMSController {

    @Autowired
    private JmsService jmsService;
    @Autowired
    private SbpMessageService sbpMessageService;

    @Value("${mq.queue.in}")
    private String inQueueName;
    @Value("${mq.queue.out}")
    private String outQueueName;
    @Value("${mq.host}")
    private String jmsHost;
    @Value("${mq.port}")
    private int jmsPort;
    @Value("${mq.channel}")
    private String jmsChannel;
    @Value("${mq.manager.name}")
    private String jmsQueueManagerName;
    @Value("${mq.client.transport}")
    private boolean clientTransport;

    @GetMapping(value = "/jms/messages")
    public String getJmsBrowserPage(Model model) throws JMSException {
        List<SbpMessage> inMessages = sbpMessageService.browseSbpMessages(QueueDirection.IN);
        List<SbpMessage> outMessages = sbpMessageService.browseSbpMessages(QueueDirection.OUT);
        model.addAttribute("inq", inQueueName);
        model.addAttribute("outq", outQueueName);
        model.addAttribute("inq_messages", inMessages);
        model.addAttribute("outq_messages", outMessages);
        return "jms-browser";
    }

    @GetMapping(value = "/jms")
    public String getJmsSettingsPage(Model model) {
        model.addAttribute("host", jmsHost);
        model.addAttribute("port", jmsPort);
        model.addAttribute("channel", jmsChannel);
        model.addAttribute("manager", jmsQueueManagerName);
        model.addAttribute("inq", inQueueName);
        model.addAttribute("outq", outQueueName);
        model.addAttribute("clientTransport", clientTransport);
        return "jms-settings";
    }


}
