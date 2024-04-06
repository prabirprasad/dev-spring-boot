package com.springboot.demo.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//Recommended to use @Qualifier
//@Primary
public class CricketCoach implements Coach {

    public CricketCoach() {
        System.out.println("In constructor: " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkOut() {
        return "Practice fast bowling for 15 minutes";
    }
}
