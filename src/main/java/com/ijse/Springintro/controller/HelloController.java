package com.ijse.Springintro.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;


@RestController
public class HelloController {


    @GetMapping("/hello")
    public String sayHello(){
        return "Hello Spring Boot";
    }

    @PostMapping("/hello")
    public String postRequest() {
        return "This is a POST request to Hello endpoint";

    }
}