package com.dev.challenge.dto;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode
public class CuurentStatusOfAccounts {
    private Account fromAccount;
    private Account toAccount;

    public CuurentStatusOfAccounts(Account fromAccount, Account toAccount) {
        this.fromAccount = fromAccount;
        this.toAccount = toAccount;
    }


}
