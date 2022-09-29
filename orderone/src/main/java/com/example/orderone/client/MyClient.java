package com.example.orderone.client;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("myservice")
public interface MyClient {
    @GetMapping("/user")
    String toOtherService();
}
