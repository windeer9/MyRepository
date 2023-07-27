package com.example.My.Project.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HeolloController {

    @GetMapping
    public String hello(){
        return "Hello World!";
    }
}
