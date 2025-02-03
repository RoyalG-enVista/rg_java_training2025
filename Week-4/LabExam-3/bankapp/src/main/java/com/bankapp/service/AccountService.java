package com.bankapp.service;

import com.bankapp.dao.Account;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


public interface AccountService {

    @Autowired
    final AccountService accountService = null;
    
//    @Autowired
    void transfer(int from, int to, double amount);
//    @Autowired
    void deposit(int id, double amount);
//    @Autowired
    Account getAccount(int id);

    List<Account> getAllAccounts();
}