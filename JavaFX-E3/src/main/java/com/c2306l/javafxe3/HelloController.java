package com.c2306l.myproject;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private Label lbWelcome;
    @FXML
    TextField txtCode;
    @FXML
    protected void onHelloButtonClick() {
        String code = txtCode.getText();
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Category Confirmation");
        alert.setHeaderText("Confirmation");
        alert.setContentText("Do you want to get Category Code?");
        if(code.isEmpty()){
            lbWelcome.setText("Category Code must be not null");
            lbWelcome.setStyle("-fx-text-fill: red");
            txtCode.setStyle("-fx-border-color: red");
        }else{
            alert.showAndWait().ifPresent(res->{
                if(res.getButtonData().isDefaultButton()){
                    lbWelcome.setText(code);
                    lbWelcome.setStyle("fx-text-fill: green");
                }
                if(res.getButtonData().isCancelButton()){
                    lbWelcome.setText("Cancel Information");
                    lbWelcome.setStyle("-fx-border-color: red");
                }
            });
        }
    }
}