package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.logging.Logger;

@RestController
public class HelloController {

    private static Logger logger = Logger.getLogger(HelloController.class.getName());

    @GetMapping("/hello")
    public String hello() {
        logger.info(" Hello kubernetes World : ");
        return "Hello Kubernetes";
    }
}
