package com.example.todoapp.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
    @GetMapping("/hello")
    public String hello(){
        return "hello"; // hello.html 을 사용하도록 하겠다 .html 이 생략된 것
    }
}
