package com.labexam.q2jdbc.customer.service;

import com.labexam.q2jdbc.customer.dao.Customer;

import java.util.List;

public interface CustomerService {
 Customer allCust();
 Customer getCustById(int id);
 Customer addCust(Customer customer);
}
