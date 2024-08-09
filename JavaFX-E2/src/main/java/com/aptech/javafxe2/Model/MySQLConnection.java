package com.aptech.javafxe2.Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLConnection {
    private static final String url = "jdbc:mysql://localhost:3306/shop";
    private static final String user = "root";
    private static final String password = "123456";
    private static Connection conn = null;
    public MySQLConnection(Connection conn){
        MySQLConnection.conn = conn;
    }
    public static Connection getConnection() {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(MySQLConnection.url
                    ,MySQLConnection.user
                    ,MySQLConnection.password);
        }catch(SQLException | ClassNotFoundException e){
            System.out.println(e.getMessage());
        }
        return conn;
    }
    public static void closeConnection(){
        try {
            conn.close();
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }
}
