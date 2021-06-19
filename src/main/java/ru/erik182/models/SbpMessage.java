package ru.erik182.models;

import lombok.Builder;
import lombok.Data;

import java.sql.Timestamp;

@Data
@Builder
public class SbpMessage {
    private Timestamp timestamp;
    private String content;
    private String userId;
    private String appId;
    private int priority;
    private String messageId;
    private String format;
    private String characterSet;
    private String encoding;
}
