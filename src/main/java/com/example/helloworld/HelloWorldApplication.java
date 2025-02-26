package com.example.helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloWorldApplication {
    public static void main(String[] args) {
        String port = System.getenv("PORT");
        System.out.println("PORT from env: " + port); // Debug
        SpringApplication.run(HelloWorldApplication.class, args);
    }
}