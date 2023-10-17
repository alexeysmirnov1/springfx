package com.example.demo.Infrastructure.controllers;

import com.example.demo.Infrastructure.services.Service;
import com.example.demo.UI.Stage;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TestController {
    @FXML
    public Button button;

    @FXML
    public Label text;

    @Autowired
    private Service service;

    @Autowired
    private Stage stage;

    @FXML
    public void initialize() {
        this.button.setOnAction(actionEvent -> this.stage.switchToEditor());
    }
}
