package com.c2306l.javafxe3.Controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.StackPane;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class LayoutController implements Initializable {
    @FXML
    StackPane contentPane;
    @FXML
    MenuItem mnCategoryList;
    @FXML
    public void setContentPane(StackPane newContentPane) {
        contentPane.getChildren().clear();
        contentPane.getChildren().add(newContentPane);
    }
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        mnCategoryList.setOnAction(event -> {
            //load view Category
            getContentPane("com/c2306l/javafxe3/category.fxml");
        });
    }
    @FXML
    public void getContentPane(String fileFXML) {
        StackPane newContentPane;
        try{
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource(fileFXML));
            newContentPane = (StackPane)loader.load();
            setContentPane(newContentPane);
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    //Transfer data 2 Scene
}
