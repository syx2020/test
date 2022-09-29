package com.example.userone.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Controller
@RequestMapping("/user")
public class Mycontroller {
    @Value("${pattern.dateformat}")
    private String time;

    @GetMapping
    @ResponseBody
    public String say(){
        System.out.println("user go!");
        return "hello";
    }
    @GetMapping("/now")
    @ResponseBody
    public String time(){
        System.out.println(LocalDateTime.now().format(DateTimeFormatter.ofPattern(time)));
        return LocalDateTime.now().format(DateTimeFormatter.ofPattern(time));
    }
}
