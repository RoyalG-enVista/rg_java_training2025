package com.bankapp.dao;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


public interface AccountDao {

    @Autowired
    @Transactional
    public List<Account> getAll();
    public Account getById(int id);
    public void updateAccount(Account account);
    public void addAccount(Account account);
    public void deleteAccount(int id);


    void update(Account account);

    @Autowired
    Account find(int from);


//    @Transactional
//    void update(Account account);
//
//    Account find(int id);


}