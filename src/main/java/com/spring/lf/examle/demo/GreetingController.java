package com.spring.lf.examle.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
    @RequestMapping(path = "/greeting")
    public String getGreeting(){
        return "Hello! This is greeting from Allen!";
    }
}

