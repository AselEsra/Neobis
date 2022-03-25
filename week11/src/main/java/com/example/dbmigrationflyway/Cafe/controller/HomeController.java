package com.example.dbmigrationflyway.Cafe.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping("/")
    public String helloAdmin(){
        return "<h1> Hello! </h1>";
    }
}
