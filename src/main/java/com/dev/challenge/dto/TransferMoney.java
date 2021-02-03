package com.dev.challenge.dto;


public class TransferMoney {
    private String fromAccount;
    private String toAccount;
    private double amount;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TransferMoney)) return false;

        TransferMoney that = (TransferMoney) o;

        if (Double.compare(that.amount, amount) != 0) return false;
        if (!fromAccount.equals(that.fromAccount)) return false;
        return toAccount.equals(that.toAccount);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = fromAccount.hashCode();
        result = 31 * result + toAccount.hashCode();
        temp = Double.doubleToLongBits(amount);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

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

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
