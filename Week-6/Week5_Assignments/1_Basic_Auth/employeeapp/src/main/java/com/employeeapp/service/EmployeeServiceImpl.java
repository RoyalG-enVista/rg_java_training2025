package com.employeeapp.service;

import com.employeeapp.entities.Employee;
import com.employeeapp.exceptions.EmployeeAlreadyExistException;
import com.employeeapp.exceptions.EmplpoyeeNotFoundException;
import com.employeeapp.repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {
    private EmployeeRepo employeeRepo;

    @Autowired
    public EmployeeServiceImpl(EmployeeRepo employeeRepo) {
        this.employeeRepo = employeeRepo;
    }


    @Override
    public List<Employee> getAll() {
        return employeeRepo.findAll();
    }

    @Override
    public Employee addEmployee(Employee employee) {

        if (getEmployeeByEmail(employee.getEmail()) != null) {
            throw new EmployeeAlreadyExistException("Employee with email " + employee.getEmail() + " already exist");
        }
        return employeeRepo.save(employee);
    }

    @Override
    public Employee deleteEmployee(int id) {
        Employee employeeToDelete = getEmployeeById(id);
        employeeRepo.delete(employeeToDelete);
        return employeeToDelete;
    }


    @Override
    public Employee updateEmployee(int id, Employee employee) {
        Employee employeeToUpdate = getEmployeeById(id);
        employeeToUpdate.setSalary(employee.getSalary());
        employeeRepo.save(employeeToUpdate);
        return employeeToUpdate;
    }

    @Override
    public Employee getEmployeeById(int id) {
        return employeeRepo.findById(id).orElseThrow(() ->
                new EmplpoyeeNotFoundException("Employee with id " + id + " is not found"));
    }

    @Override
    public Employee getEmployeeByEmail(String email) {
//        Employee employee = employeeRepo.findByEmail(email);
//        if (employee != null) {
//            return employee;
//        }
        return employeeRepo.findByEmail(email);
    }
}
