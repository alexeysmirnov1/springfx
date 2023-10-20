package com.example.demo.ide.UI;

import com.example.demo.ide.UI.Scenes.Editor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class Stage {
    @Autowired
    private ConfigurableApplicationContext context;

    public void switchToEditor() {
        this.switchScene(
            this.context.getBean(Editor.class).load()
        );
    }

    public void switchScene(javafx.scene.Scene scene) {
        javafx.stage.Stage stage = this.context.getBean(javafx.stage.Stage.class);
        stage.setScene(scene);
        stage.centerOnScreen();
    }
}
