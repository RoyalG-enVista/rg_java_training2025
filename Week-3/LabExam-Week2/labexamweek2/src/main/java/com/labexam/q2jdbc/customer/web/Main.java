package com.labexam.q2jdbc.customer.web;

import com.labexam.q2jdbc.customer.dao.Customer;
import com.labexam.q2jdbc.customer.dao.CustomerDao;
import com.labexam.q2jdbc.customer.dao.impl.CustomerDaoJdbcImpl;
import com.labexam.q2jdbc.customer.exception.DaoException;
import com.labexam.q2jdbc.customer.service.CustomerService;
import com.labexam.q2jdbc.customer.service.CustomerServiceImpl;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        CustomerService cs=new CustomerServiceImpl();
        System.out.println("------------Adding records---------------");
        cs.addCust(new Customer(201,"Royal","Mumbai",878867));
        cs.addCust(new Customer(202,"Sumukha","Bangalore",998878));
        System.out.println("-----------------finding record by id-------------");
        Customer c= cs.getCustById(201);
        if(c!=null){
            System.out.println("Customer detail for the given id is:\n"+c);
        }else{
            System.out.println("Customer not found");
        }

    }

}
