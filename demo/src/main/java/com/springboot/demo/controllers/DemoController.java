package com.springboot.demo.controllers;

import com.springboot.demo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    private Coach coach;

    //Constructor Injection *recommended
    /*
    @Autowired
    public DemoController(Coach coach) {
        this.coach = coach;
    }
    */

    //Setter Injection
    /*
    @Autowired
    public void setCoach(Coach coach) {
        this.coach = coach;
    }
    */

    // Field injection *not recommended
    /*
    @Autowired
    private Coach coach;
    */
    // For overcoming multiple Coach implementation
    // Constructor Injection using Qualifier
    @Autowired
    public DemoController(@Qualifier("cricketCoach") Coach coach) {
        System.out.println("In constructor: " + getClass().getSimpleName());
        this.coach = coach;
    }

    // Used @Primary annotation in CricketCoach instead of @Qualifier
    //Recommended to use @Qualifier
    /*
    @Autowired
    public DemoController(Coach coach) {
        this.coach = coach;
    }
    */

    @GetMapping("/dailyworkout")
    public String getDailyWorkout() {
        return coach.getDailyWorkOut();
    }
}
