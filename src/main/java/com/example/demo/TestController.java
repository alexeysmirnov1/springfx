package com.example.demo;

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

    @FXML
    public void initialize() {
        this.button.setOnAction(actionEvent -> this.text.setText(this.service.text()));
    }
}
