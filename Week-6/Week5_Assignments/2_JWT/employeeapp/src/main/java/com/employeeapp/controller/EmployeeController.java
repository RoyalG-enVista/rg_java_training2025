package com.employeeapp.controller;

import com.employeeapp.entities.Employee;
import com.employeeapp.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    private EmployeeService employeeService;

    @Autowired
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    //get all employees
    @GetMapping
    public List<Employee> getAllEmployees() {
        return employeeService.getAll();
    }

    //get employee by id
    @GetMapping("/{id}")
    public Employee getEmployeeById(@PathVariable int id) {
        return employeeService.getEmployeeById(id);
    }

    //add employee
    @PostMapping
    public Employee addEmployee(@RequestParam Employee employee) {
        return employeeService.addEmployee(employee);
    }

    //update employee

    @PutMapping
    public Employee updateEmployee(@RequestParam int id, Employee employee) {
        return employeeService.updateEmployee(id, employee);
    }


}
