package com.jdbcdelete;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteDemo {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/trainingdb", "root", "root");
        PreparedStatement ps =  con.prepareStatement("delete from register where email=?");
        ps.setString(1, "maria@gamil.com");

        int i = ps.executeUpdate();

        if (i > 0){
            System.out.println("deletion success");
        } else {
            System.out.println("deletion failed");
        }
    }              //this will not add new record into DB
}
