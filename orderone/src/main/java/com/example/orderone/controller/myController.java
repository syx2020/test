package com.example.orderone.controller;

import com.example.orderone.client.MyClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

@Controller
@RequestMapping("/order")
public class myController {
    @Autowired
    RestTemplate restTemplate;
    @Autowired
    MyClient myClient;
    @GetMapping
    @ResponseBody
    public String talk(){
        String str=myClient.toOtherService();
        System.out.println("order go!");
        return str+" SpringCloud";
    }

}
