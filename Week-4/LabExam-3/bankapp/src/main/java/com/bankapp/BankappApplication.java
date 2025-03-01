package com.bankapp;

import com.bankapp.dao.Account;
import com.bankapp.service.AccountService;
import com.bankapp.service.AccountServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;


@SpringBootApplication
public class BankappApplication {


    public static void main(String[] args) {
        // Create an instance of AccountService
        AccountService accountService = new AccountServiceImpl(null);

        System.out.println("before transfer");
        List<Account> getAllAccounts = accountService.getAllAccounts();
        getAllAccounts.forEach(System.out::println);

        accountService.transfer(1,2,10);
        System.out.println("after transfer");
        getAllAccounts = accountService.getAllAccounts();
        getAllAccounts.forEach(System.out::println);

    }
}