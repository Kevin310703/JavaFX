package com.aptech.javafxe2.Controller;

import com.aptech.javafxe2.Entity.Category;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ResourceBundle;

public class CategoryController {
    private ObservableList<Category> data;
    @FXML
    TableView<Category> categories;
    @FXML
    TableColumn<Category, String> cid;
    @FXML
    TableColumn<Category, String> cname;
    @FXML
    TableColumn<Category, String> ccode;
    @FXML
    TableColumn<Category, String> cdes;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        data =  new com.aptech.javafxe2.Model.Category().findAll();
        cid.setCellValueFactory(new PropertyValueFactory<>("Id"));
        cname.setCellValueFactory(new PropertyValueFactory<>("Name"));
        ccode.setCellValueFactory(new PropertyValueFactory<>("Code"));
        cdes.setCellValueFactory(new PropertyValueFactory<>("Description"));
        categories.setItems(data);
    }
}
