package com.example.demo.ide.UI.Scenes;

import com.example.demo.ide.UI.Scene;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;

@Component
public class Editor extends Scene {
    public Editor(@Value("classpath:/view/editor.fxml") Resource resource) {
        this.fxml = resource;
        this.width = 900;
        this.height = 500;
    }
}
