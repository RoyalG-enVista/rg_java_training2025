package com.studentapp.controller;

import com.studentapp.repo.Student;
import com.studentapp.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {


        private StudentService service;

        @Autowired
        public StudentController(StudentService service) {
                this.service = service;
        }

        //get all students
        @GetMapping("/students")
        public List<Student> getAllStudents() {
                System.out.println(service.getAllStudents());
                return service.getAllStudents();
        }

       /* //get student by id
        @GetMapping("/student/{id}")
        public Student getStudentById(@PathVariable Integer id) {
                return service.getStudentById(id);
        }*/

        //add student

        //update student

        //delete student

}
