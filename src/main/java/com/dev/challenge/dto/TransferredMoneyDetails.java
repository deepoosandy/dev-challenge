package com.dev.challenge.dto;

import java.time.LocalDateTime;

public class TransferredMoneyDetails {
    private String fromAccount;
    private String toAccount;
    private double amountTransferred;
    private LocalDateTime transferDate;
    private String msg;
    private PreviousStatueOfAccounts previousStatueOfAccounts;
    private CuurentStatusOfAccounts cuurentStatusOfAccounts;

    public String getFromAccount() {
        return fromAccount;
    }

    public void setFromAccount(String fromAccount) {
        this.fromAccount = fromAccount;
    }

    public String getToAccount() {
        return toAccount;
    }

    public void setToAccount(String toAccount) {
        this.toAccount = toAccount;
    }

    public double getAmountTransferred() {
        return amountTransferred;
    }

    public void setAmountTransferred(double amountTransferred) {
        this.amountTransferred = amountTransferred;
    }

    public LocalDateTime getTransferDate() {
        return transferDate;
    }

    public void setTransferDate(LocalDateTime transferDate) {
        this.transferDate = transferDate;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public PreviousStatueOfAccounts getPreviousStatueOfAccounts() {
        return previousStatueOfAccounts;
    }

    public void setPreviousStatueOfAccounts(PreviousStatueOfAccounts previousStatueOfAccounts) {
        this.previousStatueOfAccounts = previousStatueOfAccounts;
    }

    public CuurentStatusOfAccounts getCuurentStatusOfAccounts() {
        return cuurentStatusOfAccounts;
    }

    public void setCuurentStatusOfAccounts(CuurentStatusOfAccounts cuurentStatusOfAccounts) {
        this.cuurentStatusOfAccounts = cuurentStatusOfAccounts;
    }
}
