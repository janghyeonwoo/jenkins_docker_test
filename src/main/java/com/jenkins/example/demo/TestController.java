package com.jenkins.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("test")
public class TestController {

    @GetMapping("/")
    public String getTest(){
        return "test ok???";
    }
}
