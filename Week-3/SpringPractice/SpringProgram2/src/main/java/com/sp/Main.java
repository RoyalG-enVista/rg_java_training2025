package com.sp;

import com.resources.SpringConfigFile;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigFile.class);

        Student std = context.getBean("stdId1", Student.class);
    //both are same
        Student std1 = (Student) context.getBean("stdId1");
        std.display();      //both are same
        System.out.println("___________________________");
        std1.display();
    }
}