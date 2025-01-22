package com.labexam.q2jdbc.customer.service;

import com.labexam.q2jdbc.customer.dao.Customer;
import com.labexam.q2jdbc.customer.dao.CustomerDao;
import com.labexam.q2jdbc.customer.dao.impl.CustomerDaoJdbcImpl;
import com.labexam.q2jdbc.customer.exception.CustomerNotFoundException;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.logging.Logger;

public class CustomerServiceImpl implements  CustomerService{

    private CustomerDao cust=new CustomerDaoJdbcImpl();
    @Override
    public Customer allCust() {
        return (Customer) cust.allCust();
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
