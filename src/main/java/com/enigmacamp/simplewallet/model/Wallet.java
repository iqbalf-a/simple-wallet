package com.enigmacamp.simplewallet.model;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Wallet {
    private String customerId;
    private String transactionId;
    private String transactionType;
}
