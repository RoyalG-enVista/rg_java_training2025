package com.studentapp.repo;

import java.util.List;

public interface StudentDao {
    public List<Student> getAllStudents(); // List<Student>
    public Student addStudent(Student student);
    public void updateStudent(int id, Student student);
    public void deleteStudent(int id);
    public Student getStudentById(int id);
}
