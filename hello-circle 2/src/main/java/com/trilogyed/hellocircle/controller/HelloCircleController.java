package com.trilogyed.hellocircle.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class HelloCircleController {
    @GetMapping(value = "/hello")
    public String helloCircle(){
        return "Hello, Circle!";
    }
}
