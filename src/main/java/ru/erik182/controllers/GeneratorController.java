package ru.erik182.controllers;

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
import ru.erik182.models.GeneratorSettingsForm;
import ru.erik182.models.MessageDto;
import ru.erik182.services.GeneratorService;

import java.io.IOException;
import java.net.URISyntaxException;

@Controller
public class GeneratorController {

    @Autowired
    private GeneratorService generatorService;

    @Value("${spring.datasource.url}")
    private String dbUrl;
    @Value("${spring.datasource.driver-class-name}")
    private String dbDriverClassName;
    @Value("${spring.datasource.username}")
    private String dbUsername;
    @Value("${spring.datasource.password}")
    private String dbPassword;

    @Value("${success.message.200}")
    private String successMessage;

    @GetMapping(value = "/db-settings")
    public String getDbSettingsPage(Model model) {
        model.addAttribute("dbUrl", dbUrl);
        model.addAttribute("dbDriverClassName", dbDriverClassName);
        model.addAttribute("dbUsername", dbUsername);
        model.addAttribute("dbPassword", dbPassword);
        return "db-settings";
    }

    @GetMapping(value = "/generator")
    public String getGeneratorPage(Model model) {
        model.addAttribute("ed701list", generatorService.getEd701List());
        return "generator";
    }

    @PostMapping(value = "/generator", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public ResponseEntity<MessageDto> generate(@RequestBody GeneratorSettingsForm form) throws IOException, URISyntaxException {
        generatorService.generateED701(form);
        return ResponseEntity.ok(MessageDto.builder()
                .message(successMessage)
                .build());
    }

}
