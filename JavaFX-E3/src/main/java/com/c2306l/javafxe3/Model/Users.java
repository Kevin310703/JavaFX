package com.c2306l.javafxe3.Model;
import com.c2306l.javafxe3.IGeneric.IService;
import javafx.collections.ObservableList;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Users implements IService<com.c2306l.javafxe3.Entity.Users> {
    private static final Connection conn = MySQLConnection.getConnection();
    public static com.c2306l.javafxe3.Entity.Users findByUserName(String userName) {
        String sql = "select password from users where username = ?";
        com.c2306l.javafxe3.Entity.Users user = new com.c2306l.javafxe3.Entity.Users();
        try{
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, userName);
            ResultSet rs = pst.executeQuery();
            if(rs.next()) {
                user.setUsername(userName);
                user.setPassword(rs.getString("password"));
            }
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
        return user;
    }
    @Override
    public void insert(com.c2306l.javafxe3.Entity.Users users) {

    }

    @Override
    public void remove(com.c2306l.javafxe3.Entity.Users users) {

    }

    @Override
    public void edit(com.c2306l.javafxe3.Entity.Users users) {

    }

    @Override
    public com.c2306l.javafxe3.Entity.Users findById(com.c2306l.javafxe3.Entity.Users users) {
        return null;
    }

    @Override
    public ObservableList<com.c2306l.javafxe3.Entity.Users> findAll() {
        return null;
    }
}
