package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.logging.Logger;

@RestController
public class HelloController {
    private static final Logger LOGGER = Logger.getLogger(HelloController.class.getName());

    @GetMapping(value = {"/", ""})
    public String hello() {
        LOGGER.info("Hello endpoint hit!");
        System.out.println("Hello endpoint hit via System.out!");
        return "Hello, World!";
    }
}