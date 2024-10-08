package com.c2306l.javafxe3.Controller;

import com.c2306l.javafxe3.Entity.Category;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ResourceBundle;

public class CategoryController implements Initializable {
    private ObservableList<com.c2306l.javafxe3.Entity.Category> data;
    @FXML TableView<com.c2306l.javafxe3.Entity.Category> categories;
    @FXML TableColumn<com.c2306l.javafxe3.Entity.Category, String> cid;
    @FXML TableColumn<com.c2306l.javafxe3.Entity.Category, String> cname;
    @FXML TableColumn<com.c2306l.javafxe3.Entity.Category, String> ccode;
    @FXML TableColumn<com.c2306l.javafxe3.Entity.Category, String> cdes;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        data =  new com.c2306l.javafxe3.Model.Category().findAll();
        cid.setCellValueFactory(new PropertyValueFactory<>("Id"));
        cname.setCellValueFactory(new PropertyValueFactory<>("Name"));
        ccode.setCellValueFactory(new PropertyValueFactory<>("Code"));
        cdes.setCellValueFactory(new PropertyValueFactory<>("Description"));
        categories.setItems(data);
    }
}

