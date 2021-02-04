package com.dev.challenge.dto;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.RequiredArgsConstructor;

@Data
public class Account {
    private String accountNumber;
    private double amountInAccount;
    private String accountHolderName;
    private AccountDetails accountDetails;

    public Account(String accountNumber, double amountInAccount) {
        this.accountNumber = accountNumber;
        this.amountInAccount = amountInAccount;
    }

}
