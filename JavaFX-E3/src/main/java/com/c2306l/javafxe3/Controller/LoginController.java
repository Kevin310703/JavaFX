package com.c2306l.javafxe3.Controller;

import com.c2306l.javafxe3.Global.AppProperties;
import com.c2306l.javafxe3.Service.AuthenticationService;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class LoginController implements Initializable {
    @FXML private TextField txtUserName;
    @FXML private PasswordField txtPassword;
    @FXML private Button btnLogin;
    @FXML private Label lblInform;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        btnLogin.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                boolean isLoggedin = true;
                String userName = txtUserName.getText();
                String password = txtPassword.getText();
                if(userName.isEmpty() || password.isEmpty()){
                    lblInform.setText("Username or Password must be not Empty");
                    lblInform.setStyle("-fx-text-fill: red");
                    isLoggedin = false;
                }else{
                    if (!AuthenticationService.login(userName, password)) {
                        lblInform.setText("Invalid Username or Password");
                        lblInform.setStyle("-fx-text-fill: red");
                        isLoggedin = false;
                    }
                }
                if(isLoggedin){
                    Node node = (Node) actionEvent.getSource();
                    Stage stage = (Stage) node.getScene().getWindow();
                    stage.close();
                    //Loading Layout
                    try {
                        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("com/c2306l/javafxe3/layout.fxml"));
                        //fxmlLoader.setLocation();
                        Scene scene = new Scene(fxmlLoader.load(), 800,600 );
                        stage.setTitle("My Project");
                        stage.setScene(scene);
                        stage.show();
                    } catch (IOException e) {
                        System.out.println(e.getMessage());
                    }
                    AppProperties.setProperty("user.name",userName);
                    AppProperties.setProperty("user.loggedin","true");
                }
            }
        });

    }

}
