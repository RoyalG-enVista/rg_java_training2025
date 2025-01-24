package com.customerapp.service;

import com.customerapp.dao.Customer;
import com.customerapp.dao.CustomerDao;
import com.customerapp.dao.impl.CustomerDaoJdbcImpl;

import java.util.List;

public class CustomerServiceImpl implements  CustomerService{

    private CustomerDao cust=new CustomerDaoJdbcImpl();
    @Override
    public List<Customer> allCust() {
        return cust.allCust();
    }

    @Override
    public Customer getCustById(int id) {
        return cust.getCustById(id);
    }

    @Override
    public Customer addCust(Customer customer) {
        return cust.addCust(customer);
    }
}
