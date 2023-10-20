package com.example.demo.ide.UI;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.io.Resource;

import java.io.IOException;
import java.net.URL;

public class Scene {
    @Autowired
    private ConfigurableApplicationContext context;

    protected Resource fxml;

    protected int width = 900;
    protected int height = 400;

    public javafx.scene.Scene load() {
        try {
            URL url = this.fxml.getURL();
            FXMLLoader fxmlLoader = new FXMLLoader(url);
            fxmlLoader.setControllerFactory(this.context::getBean);
            Parent root = fxmlLoader.load();
            return new javafx.scene.Scene(root, this.width, this.height);
        } catch (
            IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
