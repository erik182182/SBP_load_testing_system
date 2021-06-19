package ru.erik182.models;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class GeneratorSettingsForm {
    private int messageCount;
    private String edType;
    private String resultDirectoryUrl;
    private String generateMethod;
}
