package com.c2306l.javafxe1.Controller;

import com.c2306l.javafxe1.FxmlLoader;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;

import java.net.URL;
import java.util.ResourceBundle;

public class MenuController implements Initializable {
    @FXML
    private BorderPane mainBorderPane;

    @FXML
    Pane viewPane;

    @FXML
    public void openCategory(ActionEvent event) {
        FxmlLoader fxmlLoader = new FxmlLoader();
        viewPane = fxmlLoader.getViewPane("/com/c2306l/javafxe1/Category/Category.fxml");
        mainBorderPane.setCenter(viewPane);
    }

    @FXML
    public void openProduct(ActionEvent event) {
        FxmlLoader fxmlLoader = new FxmlLoader();
        viewPane = fxmlLoader.getViewPane("/com/c2306l/javafxe1/Category/Product.fxml");
        mainBorderPane.setCenter(viewPane);
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
