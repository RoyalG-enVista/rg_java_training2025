package com.studentapp.controller;

import com.studentapp.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    StudentRepo repo;

    @RequestMapping("/getStudents")
    public List<Student> getStudents() {

        return repo.findAll();      // this is inbuilt method to fetch data from database

      /*  return List.of(
                new Student(1, "Royal", 20),
                new Student(2, "Sumukha", 21),
                new Student(3, "Shyam", 22)
        );*/
    }
}
