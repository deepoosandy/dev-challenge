package com.dev.challenge.dto;

public class Account {
    private String accountNumber;
    private double amountInAccount;
    private AccountDetails accountDetails;

    public Account(String accountNumber, double amountInAccount) {
        this.accountNumber = accountNumber;
        this.amountInAccount = amountInAccount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Account)) return false;

        Account account = (Account) o;

        if (Double.compare(account.amountInAccount, amountInAccount) != 0) return false;
        if (!accountNumber.equals(account.accountNumber)) return false;
        return accountDetails.equals(account.accountDetails);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = accountNumber.hashCode();
        temp = Double.doubleToLongBits(amountInAccount);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + accountDetails.hashCode();
        return result;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getAmountInAccount() {
        return amountInAccount;
    }

    public void setAmountInAccount(double amountInAccount) {
        this.amountInAccount = amountInAccount;
    }

    public AccountDetails getAccountDetails() {
        return accountDetails;
    }

    public void setAccountDetails(AccountDetails accountDetails) {
        this.accountDetails = accountDetails;
    }
}
