package com.springboot.demo.controllers;

import com.springboot.demo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    private Coach coach1;

    /*
    // For testing scope type equality
    private Coach coach2;

    @Autowired
    public DemoController(
            @Qualifier("cricketCoach") Coach coach1,
            @Qualifier("cricketCoach") Coach coach2) {
        this.coach1 = coach1;
        this.coach2 = coach2;
    }

    @GetMapping("/check")
    public String check() {
        return "Comparing beans coach1 == coach2: " + (coach1  == coach2);
    }
    */

    // SwimCoach doesn't have @Component we configured it using @Bean in SportConfig
    @Autowired
    public DemoController(@Qualifier("aquatic") Coach coach1) {
        this.coach1 = coach1;
    }

    @GetMapping("/dailyworkout")
    public String getDailyWorkout() {
        return coach1.getDailyWorkOut();
    }

}
