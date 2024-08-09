package com.c2306l.myproject.Model;

import com.c2306l.myproject.IGeneric.IService;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Category implements IService<com.c2306l.myproject.Entity.Category> {
    private static Connection conn = MySQLConnection.getConnection();
    public Category(){;}
    @Override
    public void insert(com.c2306l.myproject.Entity.Category category) {
        ;
    }

    @Override
    public void remove(com.c2306l.myproject.Entity.Category category) {
        ;
    }

    @Override
    public void edit(com.c2306l.myproject.Entity.Category category) {

    }

    @Override
    public com.c2306l.myproject.Entity.Category findById(com.c2306l.myproject.Entity.Category category) {
        return null;
    }

    @Override
    public ObservableList<com.c2306l.myproject.Entity.Category> findAll() {
        ObservableList<com.c2306l.myproject.Entity.Category> categories = FXCollections.observableArrayList();
        String sql = "SELECT id, cat_code, cat_name, cat_description FROM tblcategory WHERE 1=1";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                com.c2306l.myproject.Entity.Category eCategory = new com.c2306l.myproject.Entity.Category();
                eCategory.setId(rs.getInt("id"));
                eCategory.setCode(rs.getString("cat_code"));
                eCategory.setName(rs.getString("cat_name"));
                eCategory.setDescription(rs.getString("cat_description"));
                categories.add(eCategory);
            }
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
        return categories;
    }
}
