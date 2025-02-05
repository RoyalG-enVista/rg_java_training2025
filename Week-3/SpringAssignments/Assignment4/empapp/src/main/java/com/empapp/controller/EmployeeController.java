package com.empapp.controller;

import com.empapp.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class EmployeeController {

    public static void main(String[] args) {
        ApplicationContext context = new
                AnnotationConfigApplicationContext(AppConfig.class);

    }
}
