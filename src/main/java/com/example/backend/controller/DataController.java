package com.example.backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class DataController {

    @GetMapping(value ="/springboot-data" )
    public String getData() {
        String url = "http://localhost:8000/springboot-data";
        RestTemplate restTemplate = new RestTemplate();
        String result = restTemplate.getForObject(url,String.class);
        return result;
    }
    @GetMapping(value ="/springboot-data1")
    public String getData1() {
        return "Hello from Spring Boot!";
    }
}
