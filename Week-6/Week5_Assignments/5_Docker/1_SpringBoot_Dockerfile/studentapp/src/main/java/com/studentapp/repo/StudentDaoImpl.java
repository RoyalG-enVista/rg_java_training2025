package com.studentapp.repo;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class StudentDaoImpl implements StudentDao{

    private static Map<Integer, Student> studentMap = new HashMap<>();
    private static int counter = 0;

    static {
        studentMap.put(1, new Student(1, "John", 20, "New York"));
        studentMap.put(2, new Student(2, "Mike", 25, "London"));
        studentMap.put(3, new Student(3, "Jane", 22, "Tokyo"));
    }

    @Override
    public List<Student> getAllStudents() {
        System.out.println("Map Code");
        return new ArrayList<Student>(studentMap.values());
    }

    @Override
    public Student addStudent(Student student) {
        student.setId(++counter);
        studentMap.put(counter, student);
        return studentMap.get(counter);
    }

    @Override
    public void updateStudent(int id, Student student) {

    }

    @Override
    public void deleteStudent(int id) {

    }

    @Override
    public Student getStudentById(int id) {
        return null;
    }
}
