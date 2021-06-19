package ru.erik182.controllers;

import org.apache.commons.configuration.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import ru.erik182.enums.InterfaceView;
import ru.erik182.models.JMeterSettingsForm;
import ru.erik182.models.MessageDto;
import ru.erik182.services.JMeterService;

import java.io.IOException;


@Controller
public class JMeterController {

    @Autowired
    private Configuration jmeterConfig;
    @Autowired
    private JMeterService jmeterService;

    @Value("${mq.context.provided.url}")
    private String providedUrl;
    @Value("${mq.context.factory.name}")
    private String factoryName;
    @Value("${mq.context.initial.factory}")
    private String initialFactory;
    @Value("${mq.context.in.object}")
    private String inObjectName;
    @Value("${mq.context.out.object}")
    private String outObjectName;

    @Value("${success.message.200}")
    private String successMessage;

    @GetMapping("/jmeter")
    public String getJMeterPage(Model model) {
        model.addAttribute("providedUrl", providedUrl);
        model.addAttribute("factoryName", factoryName);
        model.addAttribute("initialFactory", initialFactory);
        model.addAttribute("inObjectName", inObjectName);
        model.addAttribute("outObjectName", outObjectName);

        model.addAttribute("userNumber", jmeterConfig.getInt("jmeter.thread.number.user"));
        model.addAttribute("rampup", jmeterConfig.getInt("jmeter.thread.rampup.seconds"));
        model.addAttribute("numberLoopCount", jmeterConfig.getInt("jmeter.thread.loop.count"));
        model.addAttribute("jmsExpiration", jmeterConfig.getInt("jmeter.jms.expiration"));
        model.addAttribute("jmsPriority", jmeterConfig.getInt("jmeter.jms.priority"));
        model.addAttribute("xmlDirectory", jmeterConfig.getString("jmeter.path.xml.directory"));
        return "jmeter";
    }

    @PostMapping(value = "/jmeter", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public ResponseEntity<MessageDto> launchJMeter(@RequestBody JMeterSettingsForm form) throws IOException, InterruptedException {
        jmeterService.saveJMeterSettings(form);
        jmeterService.launchJMeter(InterfaceView.valueOf(form.getInterfaceView()));
        return ResponseEntity.ok(MessageDto.builder()
                .message(successMessage)
                .build());
    }
}
