package com.dev.challenge.service.impl;

import com.dev.challenge.dto.Account;
import com.dev.challenge.dto.TransferMoney;
import com.dev.challenge.dto.TransferredMoneyDetails;
import com.dev.challenge.service.AmountTransferService;
import com.dev.challenge.transferservices.MoneyTransferService;
import com.dev.challenge.transferservices.TransferServiceRunner;
import org.springframework.stereotype.Service;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

@Service
public class AmountTransferServiceImpl implements AmountTransferService {

    @Override
    public TransferredMoneyDetails amountTransfer(TransferMoney transferMoney) throws Exception {
        if(transferMoney.getFromAccount()==null) throw new Exception("From Account Number can not be null");
        if(transferMoney.getToAccount()==null) throw new Exception("To Account Number can not be null");
        if(transferMoney.getAmount()>0) throw new Exception("Amount must be greater than 0");
        Account fromAccount = new Account(transferMoney.getFromAccount(), 15000);
        Account toAccount = new Account(transferMoney.getToAccount(), 16000);
        MoneyTransferService moneyTransferService = new MoneyTransferService(fromAccount, toAccount, transferMoney.getAmount());
        TransferServiceRunner transferServiceRunner = new TransferServiceRunner(moneyTransferService);
        ExecutorService es = Executors.newSingleThreadExecutor();
        Future futureTransferredMoneyDetails = es.submit(transferServiceRunner);
        if(futureTransferredMoneyDetails.isDone()){

        }
        return (TransferredMoneyDetails) futureTransferredMoneyDetails.get();
    }
}
