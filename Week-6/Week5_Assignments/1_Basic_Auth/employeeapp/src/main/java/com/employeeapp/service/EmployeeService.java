package com.employeeapp.service;

import com.employeeapp.entities.Employee;

import java.util.List;

public interface EmployeeService {

    public List<Employee> getAll();
    public Employee addEmployee(Employee employee);

    public Employee deleteEmployee(int id);

//    Employee deleteEmployee(Integer id);

    public Employee updateEmployee(int id, Employee employee);
    public Employee getEmployeeById(int id);
    public Employee getEmployeeByEmail(String email);
}
