package com.bankapp.controller;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/home")
    public String home(){
        return "hello home";
    }

    @GetMapping("/admin")
    public String admin(){
        return "hello admin";
    }

    @GetMapping("/mgr")
    public String mgr(){
        return "hello mgr";
    }

    @GetMapping("/clerk")
    public String clerk(){
        return "hello clerk";
    }
}
