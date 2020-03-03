package com.example.spring_boot_aop_demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping(value = "/hello", method = {RequestMethod.GET})
    public String hello(@RequestParam String name) {
        return "hello, " + name;
    }
}
