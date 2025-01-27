package com.empapp.service;


import com.empapp.persistance.Employee;
import com.empapp.persistance.EmployeeDao;
import java.util.List;

public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeDao dao;

    // Setter injection for EmployeeDao
    public void setDao(EmployeeDao dao) {
        this.dao = dao;
    }

    @Override
    public List<Employee> getAllEmployees() {
        return dao.getAllEmployees();
    }

//    @Override
//    public Employee addEmployee(Employee employee) {
//        return null;
//    }

    @Override
    public void addEmployee(Employee employee) {
        dao.addEmployee(employee);
    }

    @Override
    public void deleteEmployee(int id) {
        dao.deleteEmployee(id);
    }

    @Override
    public void updateEmployee(int id, Employee employee) {
        dao.updateEmployee(id, employee);
    }

    @Override
    public Employee getEmployeeById(int id) {
        return dao.getEmployeeById(id);
    }
}
