package com.test.myapp6.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Value(value = "${myapp.message}")
    private String message;

    @GetMapping("/msg")
    public String getMessage(){
        return message;
    }
}
