package ru.erik182.services;

import org.apache.commons.configuration.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import ru.erik182.enums.InterfaceView;
import ru.erik182.models.JMeterSettingsForm;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;

@Service
public class JMeterService {

    @Autowired
    private Configuration jmeterConfig;

    @Value("${jmeter.path}")
    private String jmeterPath;
    @Value("${jmeter.prop.path}")
    private String jmeterPropPath;
    @Value("${jmeter.jmx.path}")
    private String jmeterJmxPath;
    @Value("${jmeter.log.path}")
    private String jmeterLogPath;
    @Value("${jmeter.res.path}")
    private String jmeterResultDirectoryPath;

    @Value("${jmeter.prop.comments}")
    private String jmeterPropComments;
    @Value("${jmeter.command.test}")
    private String jmeterCommandTest;
    @Value("${jmeter.bin.path}")
    private String jmeterBinPath;
    private final String INTERFACE_PROP = "-n";


    public void saveJMeterSettings(JMeterSettingsForm form) throws IOException {
        updateCurrentSettings(form);
        updatePropertyFile(form);
    }

    private void updateCurrentSettings(JMeterSettingsForm form) {
        jmeterConfig.setProperty("jmeter.thread.number.user", form.getUserNumber());
        jmeterConfig.setProperty("jmeter.thread.rampup.seconds", form.getRampup());
        jmeterConfig.setProperty("jmeter.thread.loop.count", form.getLoopCount());
        jmeterConfig.setProperty("jmeter.jms.expiration", form.getExpiration());
        jmeterConfig.setProperty("jmeter.jms.priority", form.getPriority());
        jmeterConfig.setProperty("jmeter.path.xml.directory", form.getXmlDirectory());
    }

    private void updatePropertyFile(JMeterSettingsForm form) throws IOException {
        Properties properties = new Properties();
        properties.setProperty("jmeter.thread.number.user", String.valueOf(form.getUserNumber()));
        properties.setProperty("jmeter.thread.rampup.seconds", String.valueOf(form.getRampup()));
        properties.setProperty("jmeter.thread.loop.count", String.valueOf(form.getLoopCount()));
        properties.setProperty("jmeter.jms.expiration", String.valueOf(form.getExpiration()));
        properties.setProperty("jmeter.jms.priority", String.valueOf(form.getPriority()));
        properties.setProperty("jmeter.path.xml.directory", form.getXmlDirectory());
        File file = new File(jmeterPath + jmeterPropPath);
        OutputStream os = new FileOutputStream(file);
        properties.store(os, jmeterPropComments);
        os.close();
    }

    public void launchJMeter(InterfaceView interfaceView) throws IOException, InterruptedException {
        String command = "";
        if (interfaceView.equals(InterfaceView.GRAPHICAL)) {
            command = String.format(jmeterCommandTest,
                    jmeterBinPath,
                    "",
                    jmeterPath + jmeterJmxPath,
                    jmeterPath + jmeterLogPath,
                    jmeterPath + jmeterResultDirectoryPath
            );
        } else if (interfaceView.equals(InterfaceView.CONSOLE)) {
            command = String.format(jmeterCommandTest,
                    jmeterBinPath,
                    INTERFACE_PROP,
                    jmeterPath + jmeterJmxPath,
                    jmeterPath + jmeterLogPath,
                    jmeterPath + jmeterResultDirectoryPath
            );
        }
        Process proc = Runtime.getRuntime().exec(command);
        proc.waitFor();
        proc.destroy();
    }

}
