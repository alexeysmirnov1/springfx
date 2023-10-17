package com.example.demo.UI;

import com.example.demo.bootstrap.SpringbootJavaFxApplication;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;
import java.io.IOException;
import java.net.URL;

@Component
public class Editor {
    @Autowired
    private ConfigurableApplicationContext context;

    private final Resource fxml;

    public Editor(@Value("classpath:/view/editor.fxml") Resource resource) {
        this.fxml = resource;
    }

    public Scene load() {
        try {
            URL url = this.fxml.getURL();
            FXMLLoader fxmlLoader = new FXMLLoader(url);
            fxmlLoader.setControllerFactory(this.context::getBean);
            Parent root = fxmlLoader.load();
            return new javafx.scene.Scene(root, 900, 400);
        } catch (
        IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
