package ru.erik182.models;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class JMeterSettingsForm {
    private int userNumber;
    private int rampup;
    private int loopCount;
    private int expiration;
    private int priority;
    private String xmlDirectory;
    private String interfaceView;
}
