package com.springboot.demo.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    // Injecting custom value from application.properties
    @Value("${coach.name}")
    private String coachName;
    @Value("${team.info}")
    private String teamInfo;

    @GetMapping("/teaminfo")
    public String teamInfo() {
        return "Name: " + coachName + " Team: " + teamInfo;
    }

    @GetMapping("/")
    public String helloWorld() {
        return "Hello World!";
    }

    @GetMapping("/workout")
    public String getDailWorkout() {
        return "Run a hard 5K!";
    }

    @GetMapping("/fortune")
    public String getDailFortune() {
        return "Today is your lucky day!";
    }
}
