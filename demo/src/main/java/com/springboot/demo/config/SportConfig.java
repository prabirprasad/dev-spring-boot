package com.springboot.demo.config;

import com.springboot.demo.common.Coach;
import com.springboot.demo.common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// For configuring bean of SwimCoach using JAVA class
@Configuration
public class SportConfig {

    //Configuring the bean for SwimCoach
    //The bean id is default to the method name
    @Bean("aquatic")//Custom bean id
    public Coach swimCoach() {
        return new SwimCoach();
    }
}
