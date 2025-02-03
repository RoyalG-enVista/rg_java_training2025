package com.bankapp.controller;

import com.bankapp.dao.Account;
import com.bankapp.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;


import java.util.List;

@RestCo
public class AccountController {

    private AccountService accountService;

    @Autowired
    public AccountController(AccountService accountService)  {
        this.accountService = accountService;
    }

    //get all
    public ResponseEntity<List<Account>> getProducts() {
        return ResponseEntity.status(HttpStatus.OK).body(accountService.getAllAccounts());
    }



}
