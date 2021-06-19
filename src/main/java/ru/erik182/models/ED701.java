package ru.erik182.models;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ED701 {
    private String edNo;
    private String edAuthor;
    private String edReceiver;
    private String transactionID;
    private int sum;
    private String transKind;
    private String paymentID;

    private String accDocNo;

    private String organizationName;
    private String personName;

    private String address;
    private String bic;
    private String correspAcc;

    private String purpose;
}
