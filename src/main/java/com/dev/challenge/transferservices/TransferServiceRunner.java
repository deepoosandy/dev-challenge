package com.dev.challenge.transferservices;

import com.dev.challenge.dto.TransferredMoneyDetails;

import java.util.concurrent.Callable;

public class TransferServiceRunner implements Callable<TransferredMoneyDetails> {

    private MoneyTransferService moneyTransferService;

    public TransferServiceRunner(MoneyTransferService moneyTransferService) {
        this.moneyTransferService = moneyTransferService;
    }


    @Override
    public TransferredMoneyDetails call() throws Exception {
        return moneyTransferService.transferMoneyFromOneAccountToOther();
    }
}
