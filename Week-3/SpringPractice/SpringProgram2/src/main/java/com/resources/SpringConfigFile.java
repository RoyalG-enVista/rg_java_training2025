package com.resources;

import com.sp.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfigFile {

    @Bean
    public Student stdId1() {
        Student std = new Student();
        std.setName("Sachin");
        std.setRollNo(103);
        std.setEmail("sachin@gmail.com");

        return std;     //method void nahi tr return garjeche ahe

    }
}
