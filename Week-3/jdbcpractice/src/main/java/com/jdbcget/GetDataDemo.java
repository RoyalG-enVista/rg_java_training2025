package com.jdbcget;

import java.sql.*;

public class GetDataDemo {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/trainingdb", "root", "root");
        PreparedStatement ps = con.prepareStatement("select * from register");
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            System.out.println(rs.getString(1) + "|" + rs.getString(2) + "|" + rs.getString(3) + "|" + rs.getString(4) + "|" + rs.getString(5));
        }
        con.close();


    }
}
