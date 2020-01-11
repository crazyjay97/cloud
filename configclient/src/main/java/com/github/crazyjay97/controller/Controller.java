package com.github.crazyjay97.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Value("${cloud-version}")
    private String version;

    @GetMapping("getConfig")
    public String getConfig() {
        return version;
    }
}
