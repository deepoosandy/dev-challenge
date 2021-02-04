package com.dev.challenge.dto;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode
public class TransferMoney {
    private String fromAccount;
    private String toAccount;
    private double amount;

}
