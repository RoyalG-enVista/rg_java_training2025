package com.customerapp.web;

import com.customerapp.dao.Customer;

import com.customerapp.service.CustomerService;
import com.customerapp.service.CustomerServiceImpl;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        CustomerService cs=new CustomerServiceImpl();

        List<Customer> customers=cs.allCust();

        customers.forEach(System.out::println);


//        System.out.println("------------Adding records---------------");
//        cs.addCust(new Customer(201,"Royal","Mumbai",878867));
//        cs.addCust(new Customer(202,"Sumukha","Bangalore",998878));
//        System.out.println("-----------------finding record by id-------------");
//        Customer c= cs.getCustById(201);
//        if(c!=null){
//            System.out.println("Customer detail for the given id is:\n"+c);
//        }else{
//            System.out.println("Customer not found");
//        }

    }

}
