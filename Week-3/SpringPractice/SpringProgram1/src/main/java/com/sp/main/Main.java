package com.sp.main;

import com.sp.beans.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        /*String configPath = "applicationContext.xml";
        ApplicationContext context = new ClassPathXmlApplicationContext(configPath);

        Student std1 = (Student) context.getBean("stdId1");
        std1.display();

        System.out.println("_______________________________");

        Student std2 = (Student) context.getBean("stdId2");
        std2.display();*/












        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Student std1 = (Student) context.getBean("stdId1");
        std1.display();









    }
}
