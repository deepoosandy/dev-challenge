package com.dev.challenge.controller;


import com.dev.challenge.dto.Account;
import com.dev.challenge.dto.OpenAccount;
import com.dev.challenge.dto.TransferredMoneyDetails;
import com.dev.challenge.dto.TransferMoney;
import com.dev.challenge.service.AmountTransferService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.ExecutionException;

@RestController
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class AccountController {
    @Autowired
    private AmountTransferService amountTransferService;

    @PostMapping("/tarnsfermoney")
    public ResponseEntity<TransferredMoneyDetails> transferAmountBetweenAccounts(@RequestBody TransferMoney transferMoney) throws Exception {
        ResponseEntity<TransferredMoneyDetails> responseEntity=new
                ResponseEntity<TransferredMoneyDetails>(amountTransferService.amountTransfer(transferMoney), HttpStatus.OK);
        return responseEntity;
    }
    @PostMapping("/openaccount")
    public ResponseEntity<Account> openAccount(@RequestBody OpenAccount openAccount){

        return null;
    }


}
