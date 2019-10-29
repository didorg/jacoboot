package com.eldisol.jacoboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class HelloController {

    @GetMapping(value = "/greetings")
    public String greetings() {
        return "Greetings from Spring Boot!";
    }
}
