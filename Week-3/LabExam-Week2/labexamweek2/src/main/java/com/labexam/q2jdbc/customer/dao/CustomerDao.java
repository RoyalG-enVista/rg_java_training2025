package com.labexam.q2jdbc.customer.dao;

import java.util.List;

public interface CustomerDao {

    List<Customer> allCust();
    Customer getCustById(int id);
    Customer addCust(Customer customer);

}
//