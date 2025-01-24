package com.customerapp.dao.impl;

import com.customerapp.dao.Customer;
import com.customerapp.dao.CustomerDao;
import com.customerapp.factory.ConnectionFactory;

import java.sql.*;
import java.util.LinkedList;
import java.util.List;

public class CustomerDaoJdbcImpl implements CustomerDao {

    private Connection connection;

    public CustomerDaoJdbcImpl() {

        connection= ConnectionFactory.getConnection();
    }

    @Override
    public List<Customer> allCust()  {
        System.out.println("-----------using jdbc------------");
        List<Customer> customer=new LinkedList<>();
        try {
            Statement stmt = connection.createStatement();
            ResultSet rs=stmt.executeQuery("select * from customer");
            while (rs.next()){
                customer.add(new Customer(rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("address"),
                        rs.getString("phoneNumber")));
            };

        }

        catch (SQLException e) {
           e.printStackTrace();
        }
        return customer;
    }

    @Override
    public Customer getCustById(int id) {
        Customer customer=null;
        try {
            PreparedStatement preparedStatement=connection
                    .prepareStatement("select * from customer where id=?");
            preparedStatement.setInt(1,id);

            ResultSet rs=preparedStatement.executeQuery();
            if (rs.next()){
                customer=new Customer(
                        rs.getInt("id"),
                        rs.getString("name"),
                                rs.getString("address"),
                                rs.getString("phoneNumber"));
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return customer;
    }

    @Override
    public Customer addCust(Customer customer) {
        try{
            PreparedStatement prepareStatement=connection.prepareStatement("insert into customer(id, name, address, phoneNumber) values(?,?,?,?)");
            prepareStatement.setInt(1, customer.getId());
            prepareStatement.setString(2, customer.getName());
            prepareStatement.setString(3, customer.getAddress());
            prepareStatement.setString(4, customer.getPhoneNumber());

            prepareStatement.executeUpdate();
            } catch (SQLException e){
            throw new RuntimeException();
        }
        return customer;
    }
}
