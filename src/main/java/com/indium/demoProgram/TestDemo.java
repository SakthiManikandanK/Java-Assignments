package com.indium.demoProgram;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestDemo {

    @RequestMapping("/")
    public String index() {return "Hello Sakthi";
    }
    @RequestMapping("/hello")
    public String sample() {
        return "Success";
    }



}