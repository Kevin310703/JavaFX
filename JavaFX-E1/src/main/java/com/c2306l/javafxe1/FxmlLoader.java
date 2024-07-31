package com.c2306l.javafxe1;

import javafx.fxml.FXMLLoader;
import javafx.scene.layout.Pane;

import java.io.IOException;

public class FxmlLoader {
    private Pane view;

    public Pane getViewPane(String fileNamePane) {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource(fileNamePane));
            view = (Pane)loader.load();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        return view;
    }
}
