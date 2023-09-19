package com.example.backend.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ButtonController {

    @PostMapping("/echo")
    public String echoButtonName(@RequestBody String buttonName) {
        System.out.println("Received Button Name: " + buttonName);
        return "Received and echoed: " + buttonName;
    }
}