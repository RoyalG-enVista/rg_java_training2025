package com.empapp.persistance;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;

public class EmployeeDaoImp implements EmployeeDao {

    private Map<Integer, Employee> empMap = new HashMap<>();
    private static int counter = 0;

    // Injected list of Employee beans via Spring
    public EmployeeDaoImp(Map<Integer, Employee> empMap) {
        this.empMap = empMap;
    }

    @Override
    public List<Employee> getAllEmployees() {
        return new ArrayList<>(empMap.values());
    }

    @Override
    public List<Employee> getAllEmployee() {
        return List.of();
    }

    @Override
    public Employee addEmployee(Employee employee) {
        employee.setId(++counter);
        empMap.put(counter, employee);
        return empMap.get(counter);
    }

    @Override
    public void deleteEmployee(int id) {
        empMap.remove(id);
    }

    @Override
    public void updateEmployee(int id, Employee employee) {
        empMap.put(id, employee);
    }

    @Override
    public Employee getEmployeeById(int id) {
        return empMap.get(id);
    }
}
