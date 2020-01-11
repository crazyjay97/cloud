package com.github.crazyjay97.feignclient.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("api")
public interface ApiService {

    @RequestMapping("/api/hello")
    String hello();
}
