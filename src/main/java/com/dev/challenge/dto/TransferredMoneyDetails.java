package com.dev.challenge.dto;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDateTime;

@Data
@EqualsAndHashCode
public class TransferredMoneyDetails {
    private String fromAccount;
    private String toAccount;
    private double amountTransferred;
    private LocalDateTime transferDate;
    private String msg;
    private PreviousStatueOfAccounts previousStatueOfAccounts;
    private CuurentStatusOfAccounts cuurentStatusOfAccounts;
}
