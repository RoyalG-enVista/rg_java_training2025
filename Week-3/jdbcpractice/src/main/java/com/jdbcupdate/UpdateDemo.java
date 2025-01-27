package com.jdbcupdate;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class UpdateDemo {

    public static void main(String[] args) throws Exception {

        String city1 = "pune";
//        String name1 = "Eva";
        String email1 = "maria@gamil.com";


        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/trainingdb", "root", "root");
        PreparedStatement ps =  con.prepareStatement("update register set city=? where email=?");

        ps.setString(1, city1);
        ps.setString(2, email1);

        int i = ps.executeUpdate();               //this will not add new record into DB

        if (i > 0){
            System.out.println("update success");
        } else {
            System.out.println("update failed");
        }

    }

}
