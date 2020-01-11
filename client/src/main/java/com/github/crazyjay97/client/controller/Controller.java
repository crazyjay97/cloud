package com.github.crazyjay97.client.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("client")
public class Controller {

    @Autowired
    private RestTemplate restTemplate;


    @RequestMapping("hello")
    @HystrixCommand(fallbackMethod = "errorFallback")
    public String hello() {
        String body = restTemplate.getForEntity("http://API/hello", String.class).getBody();
        return "hello" + body;
    }

    public String errorFallback() {
        return "error";
    }
}
