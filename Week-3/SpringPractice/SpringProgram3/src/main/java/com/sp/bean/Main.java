package com.sp.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
//Note : In this we have to provide context:component scan related xml document into applicationContext.xml
//        then we need to provide @Value annotation in student.java

        
        String configPath = "applicationContext.xml";
        ApplicationContext context = new ClassPathXmlApplicationContext(configPath);

        Student std = (Student) context.getBean("student");
        std.display();

    }
}