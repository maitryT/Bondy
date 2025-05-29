package com.bondyapp.bondy.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class TestController {

    @GetMapping("/")
    public String home() {
        return "Welcome to the Book API!";
    }

}