package ru.erik182.services;

import com.google.common.io.Files;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import ru.erik182.models.ED701;
import ru.erik182.models.GeneratorSettingsForm;
import ru.erik182.repositories.ED701Repository;
import ru.erik182.utils.AppUtils;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.List;

@Service
public class GeneratorService {

    @Autowired
    private ED701Repository ed701Repository;

    @Value("${dir.xml}")
    private String xmlDirPath;
    @Value("${dir.base64}")
    private String base64DirPath;

    @Value("${path.xml.xsd}")
    private String xsdFileName;

    private static final String XML_FILE_NAME_PATTERN = "ed701-%d.xml";
    private static final String BASE64_FILE_NAME_PATTERN = "ed701-%d.txt";

    public List<ED701> getEd701List() {
        return ed701Repository.getAll();
    }

    public void generateED701(GeneratorSettingsForm form) throws IOException, URISyntaxException {
        String dirPath = form.getResultDirectoryUrl();
        File xmlDir = new File(dirPath + xmlDirPath);
        File base64Dir = new File(dirPath + base64DirPath);
        xmlDir.mkdir();
        base64Dir.mkdir();
        for (int i = 0; i < form.getMessageCount(); i++) {
            generateXmlAndBase64(dirPath, i);
        }
    }

    private void generateXmlAndBase64(String rootDirPath, int index) throws IOException, URISyntaxException {
        File xml = new File(rootDirPath + xmlDirPath + "\\" + String.format(XML_FILE_NAME_PATTERN, index + 1));
        xml.createNewFile();
        Files.copy(new File(GeneratorService.class.getClassLoader().getResource(xsdFileName).toURI()), xml);
        File base64 = new File(rootDirPath + base64DirPath + "\\" + String.format(BASE64_FILE_NAME_PATTERN, index + 1));
        Files.write(AppUtils.encodeBase64(Files.toByteArray(xml)), base64);
    }


}
