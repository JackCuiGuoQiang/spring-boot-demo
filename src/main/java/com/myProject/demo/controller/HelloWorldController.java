package com.myProject.demo.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@RestController
@Controller
@EnableAutoConfiguration
public class HelloWorldController {
    @RequestMapping("hello")
    @ResponseBody
    public String index() {
        return "Hello World";
    }
}
