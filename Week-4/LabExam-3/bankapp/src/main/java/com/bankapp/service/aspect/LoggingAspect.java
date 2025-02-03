package com.bankapp.service.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    @Before("execution(* com.bankapp.service.*.*(..))")
    public void logBefore() {
        System.out.println("Before executing business method...");
    }

    @After("execution(* com.bankapp.service.*.*(..))")
    public void logAfter() {
        System.out.println("After executing business method...");
    }

    @AfterReturning("execution(* com.bankapp.service.*.*(..))")
    public void logAfterReturning() {
        System.out.println("Method execution completed successfully.");
    }
}
