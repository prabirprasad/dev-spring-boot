package com.springboot.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/*
For scanning default package and other packages
@SpringBootApplication(
		scanBasePackages = { "com.springboot.demo","com.springboot.utils"}
)
*/
@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
