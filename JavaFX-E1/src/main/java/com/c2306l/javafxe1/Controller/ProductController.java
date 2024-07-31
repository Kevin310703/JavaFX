package com.c2306l.javafxe1.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;

public class ProductController {
    @FXML
    private void handleShowAlert(ActionEvent event) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Product Listing");
        alert.setHeaderText(null);
        alert.setContentText("Product Listing");
        alert.showAndWait();
    }
}
