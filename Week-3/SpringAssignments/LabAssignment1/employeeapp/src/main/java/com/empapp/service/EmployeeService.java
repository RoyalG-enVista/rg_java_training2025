package com.empapp.service;

import com.empapp.persistance.Employee;

import java.util.List;

public interface EmployeeService {
public List<Employee> getAllEmployees();
public void addEmployee (Employee employee);
public void deleteEmployee (int id);
public void updateEmployee (int id, Employee employee);
public Employee getEmployeeById(int id);
}