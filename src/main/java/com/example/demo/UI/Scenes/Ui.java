package com.example.demo.UI.Scenes;

import com.example.demo.UI.Scene;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;

@Component
public class Ui extends Scene {
    public Ui(@Value("classpath:/view/ui.fxml") Resource resource) {
        this.fxml = resource;
        this.width = 600;
        this.height = 600;
    }
}
