package com.bankapp.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class AccountDaoImpl implements AccountDao {

    @PersistenceContext
    private EntityManager entityManager;


    @Override
    public List<Account> getAll() {
        return List.of();
    }

    @Override
    public Account getById(int id) {
        return null;
    }

    @Override
    public void updateAccount(Account account) {

    }

    @Override
    public void addAccount(Account account) {

    }

    @Override
    public void deleteAccount(int id) {

    }

    @Transactional
    @Override
    public void update(Account account) {
        entityManager.merge(account);
    }


    @Override
    public Account find(int id) {
        return entityManager.find(Account.class, id);
    }
}