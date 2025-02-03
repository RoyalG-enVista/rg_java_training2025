package com.bankapp.controller;

import com.bankapp.dto.AccountBean;
import com.bankapp.dao.Account;
import com.bankapp.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/accounts")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @PostMapping("/transfer")
    public ResponseEntity<String> transfer(@RequestBody AccountBean accountBean) {
        try {
            accountService.transfer(accountBean.getFrom(), accountBean.getTo(), accountBean.getAmount());
            return ResponseEntity.ok("Transfer successful");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
        }
    }

    @PostMapping("/deposit/{id}")
    public ResponseEntity<String> deposit(@PathVariable int id, @RequestParam double amount) {
        try {
            accountService.deposit(id, amount);
            return ResponseEntity.ok("Deposit successful");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<Account> getAccount(@PathVariable int id) {
        Account account = accountService.getAccount(id);
        return account != null ? ResponseEntity.ok(account) : ResponseEntity.status(HttpStatus.NOT_FOUND).build();
    }
}
