package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Service {
    public String text() {
        return "text from service";
    }
}
