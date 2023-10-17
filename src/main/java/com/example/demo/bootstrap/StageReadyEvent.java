package com.example.demo.bootstrap;

import javafx.stage.Stage;
import org.springframework.context.ApplicationEvent;

public class StageReadyEvent extends ApplicationEvent {
    public Stage getStage() {
        return Stage.class.cast(getSource());
    }

    public StageReadyEvent(Stage stage) {
        super(stage);
    }
}
