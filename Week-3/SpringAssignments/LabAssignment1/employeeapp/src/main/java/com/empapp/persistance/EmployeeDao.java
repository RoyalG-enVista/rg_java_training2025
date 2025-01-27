package com.empapp.persistance;

import java.util.List;

public interface EmployeeDao {

    List<Employee> getAllEmployees();

    public List<Employee> getAllEmployee();
public Employee addEmployee (Employee employee);
public void deleteEmployee (int id);
public void updateEmployee (int id, Employee employee);
public Employee getEmployeeById(int id);
}