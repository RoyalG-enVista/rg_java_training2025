package com.studentapp.service;

import com.studentapp.repo.Student;
import com.studentapp.repo.StudentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service (value = "studentService")
public class StudentServiceImpl implements StudentService {
    private StudentDao dao;

    @Autowired
    public StudentServiceImpl(StudentDao dao) {
        this.dao = dao;
    }

    @Override
    public List<Student> getAllStudents() {
        return dao.getAllStudents();
    }

    @Override
    public Student addStudent(Student student) {
        return dao.addStudent(student);
    }

    @Override
    public void updateStudent(int id, Student student) {
        dao.updateStudent(id, student);
    }

    @Override
    public void deleteStudent(int id) {
        dao.deleteStudent(id);
    }

    @Override
    public Student getStudentById(int id) {
        return dao.getStudentById(id);
    }
}
