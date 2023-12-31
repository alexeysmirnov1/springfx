package com.example.demo;

import com.example.demo.bootstrap.SpringbootJavaFxApplication;
import javafx.application.Application;
import net.rgielen.fxweaver.core.FxWeaver;
import net.rgielen.fxweaver.spring.SpringFxWeaver;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		Application.launch(SpringbootJavaFxApplication.class, args);
	}

	@Bean
	public FxWeaver fxWeaver(ConfigurableApplicationContext context) {
		return new SpringFxWeaver(context);
	}
}
