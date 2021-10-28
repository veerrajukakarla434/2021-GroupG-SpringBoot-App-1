package com.groupg.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(value = "com.groupg.springboot")
public class Application {
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
