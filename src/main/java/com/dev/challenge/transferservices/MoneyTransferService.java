package com.dev.challenge.transferservices;

import com.dev.challenge.dto.Account;
import com.dev.challenge.dto.CuurentStatusOfAccounts;
import com.dev.challenge.dto.PreviousStatueOfAccounts;
import com.dev.challenge.dto.TransferredMoneyDetails;

import java.time.LocalDateTime;


public class MoneyTransferService {

    private Account fromAccount;
    private Account toAccount;
    private volatile boolean isTransactionDone = true;
    private double transferAmount;
    private PreviousStatueOfAccounts previousStatueOfAccounts;


    public MoneyTransferService(Account fromAccount, Account toAccount, double amount) {
        this.fromAccount = fromAccount;
        this.toAccount = toAccount;
        Account fromAcc = new Account(fromAccount.getAccountNumber(), fromAccount.getAmountInAccount());
        Account toAcc = new Account(toAccount.getAccountNumber(), toAccount.getAmountInAccount());
        previousStatueOfAccounts = new PreviousStatueOfAccounts(fromAcc, toAcc);
        this.transferAmount = amount;
    }

    public TransferredMoneyDetails transferMoneyFromOneAccountToOther() throws InterruptedException {
        TransferredMoneyDetails transferredMoneyDetails = new TransferredMoneyDetails();

        if ((fromAccount.getAmountInAccount() - transferAmount) >= 0) {
            /**
             * Transferring amount from one account to other account.
             */
            double newBalanceOfToAccount = toAccount.getAmountInAccount() + transferAmount;
            toAccount.setAmountInAccount(newBalanceOfToAccount);
            double newBalanceOfFromAccount = fromAccount.getAmountInAccount() - transferAmount;
            fromAccount.setAmountInAccount(newBalanceOfFromAccount);
            transferredMoneyDetails.setAmountTransferred(transferAmount);
            transferredMoneyDetails.setMsg("Transaction successful!");
            transferredMoneyDetails.setTransferDate(LocalDateTime.now());


        } else {
            transferredMoneyDetails.setMsg("Transaction failed!");
            transferredMoneyDetails.setTransferDate(LocalDateTime.now());
        }

        transferredMoneyDetails.setFromAccount(fromAccount.getAccountNumber());
        transferredMoneyDetails.setToAccount(toAccount.getAccountNumber());
        CuurentStatusOfAccounts cuurentStatusOfAccounts = new CuurentStatusOfAccounts(fromAccount, toAccount);
        transferredMoneyDetails.setCuurentStatusOfAccounts(cuurentStatusOfAccounts);
        transferredMoneyDetails.setPreviousStatueOfAccounts(previousStatueOfAccounts);
        return transferredMoneyDetails;
    }

}

