package com.bankapp.service;

import com.bankapp.dao.AccountDao;
import com.bankapp.dao.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountDao accountDao;

    public AccountServiceImpl(Object o) {
    }

    @Override
    public void transfer(int from, int to, double amount) {
        Account fromAccount = accountDao.find(from);
        Account toAccount = accountDao.find(to);

        if (fromAccount == null || toAccount == null) {
            throw new IllegalArgumentException("Account not found");
        }

        if (fromAccount.getBalance() < amount) {
            throw new IllegalArgumentException("Insufficient funds");
        }

        fromAccount.setBalance(fromAccount.getBalance() - amount);
        toAccount.setBalance(toAccount.getBalance() + amount);

        accountDao.update(fromAccount);
        accountDao.update(toAccount);
    }

    @Override
    public void deposit(int id, double amount) {
        Account account = accountDao.find(id);
        if (account == null) {
            throw new IllegalArgumentException("Account not found");
        }
        account.setBalance(account.getBalance() + amount);
        accountDao.update(account);
    }

    @Override
    public Account getAccount(int id) {
        return accountDao.find(id);
    }

    @Override
    public List<Account> getAllAccounts() {
        return List.of();
    }
}
