package com.aptech.javafxe2.Model;

import com.aptech.javafxe2.IGeneric.IService;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Category implements IService<com.aptech.javafxe2.Entity.Category> {
    private static Connection conn = MySQLConnection.getConnection();
    public Category(){;}


    @Override
    public void insert(com.aptech.javafxe2.Entity.Category category) {

    }

    @Override
    public void remove(com.aptech.javafxe2.Entity.Category category) {

    }

    @Override
    public void edit(com.aptech.javafxe2.Entity.Category category) {

    }

    @Override
    public com.aptech.javafxe2.Entity.Category findById(com.aptech.javafxe2.Entity.Category category) {
        return null;
    }

    @Override
    public ObservableList<com.aptech.javafxe2.Entity.Category> findAll() {
        ObservableList<com.aptech.javafxe2.Entity.Category> categories = FXCollections.observableArrayList();
        String sql = "SELECT id, cat_code, cat_name, cat_description FROM tblcategory WHERE 1=1";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                com.aptech.javafxe2.Entity.Category eCategory = new com.aptech.javafxe2.Entity.Category();
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
