package com.example.demo.UI;

import javafx.stage.Stage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class Scene {
    @Autowired
    private ConfigurableApplicationContext context;

    public void switchToEditor() {
        this.switchScene(
            this.context.getBean(Editor.class).load()
        );
    }

    public void switchScene(javafx.scene.Scene scene) {
        Stage stage = this.context.getBean(Stage.class);
        stage.setScene(scene);
    }
}
