package com.empapp.web;

import com.empapp.service.EmployeeService;
import com.empapp.persistance.Employee;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class EmployeeApp {
    public static void main(String[] args) {
        // Load the Spring context from XML
        ApplicationContext context = new ClassPathXmlApplicationContext("demo.xml");

        // Get the EmployeeService bean
        EmployeeService employeeService = (EmployeeService) context.getBean("employeeService");

        // Perform operations (CRUD)
        System.out.println("All Employees: " + employeeService.getAllEmployees());

        Employee newEmployee = new Employee();
        newEmployee.setName("Sumukha");
        newEmployee.setDept("HR");
        newEmployee.setSalary(500000);
        employeeService.addEmployee(newEmployee);

        System.out.println("All Employees after addition: " + employeeService.getAllEmployees());
    }
}

