package com.jdbcinsert;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertDemo {

    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/trainingdb", "root", "root");
        //We can also insert data using placeholders
        PreparedStatement ps =  con.prepareStatement("insert into register values(?, ?, ?, ?, ?)");
        ps.setString(1, "Maria");
        ps.setString(2, "maria@gamil.com");
        ps.setString(3, "pass@123");
        ps.setString(4, "female");
        ps.setString(5, "chennai");


        int i = ps.executeUpdate();               //this will not add new record into DB

        if (i > 0){
            System.out.println("insertion success");
        } else {
            System.out.println("insertion failed");
        }

    }

}
