package com.geekster.awsproject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {
    @GetMapping(value = "/hello")
    public String helloWorld(){
        return "Hello world";
    }
}
