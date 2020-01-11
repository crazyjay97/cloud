package com.github.crazyjay97.feignclient.controller;

import com.github.crazyjay97.feignclient.service.ApiService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Autowired
    private ApiService apiService;

    @RequestMapping("hello")
    @HystrixCommand(fallbackMethod ="helloFallback")
    public String hello() {
        return "hello " + apiService.hello();
    }

    public String helloFallback() {
        return "error";
    }
}
