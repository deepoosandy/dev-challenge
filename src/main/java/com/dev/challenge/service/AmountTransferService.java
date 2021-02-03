package com.dev.challenge.service;

import com.dev.challenge.dto.TransferMoney;
import com.dev.challenge.dto.TransferredMoneyDetails;

import java.util.concurrent.ExecutionException;

public interface AmountTransferService {
    TransferredMoneyDetails amountTransfer(TransferMoney transferMoney) throws Exception;
}
