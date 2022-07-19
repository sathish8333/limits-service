package com.sr.microservices.controller;

import com.sr.microservices.config.Configs;
import com.sr.microservices.entity.Limits;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsController {

    @Autowired
    private Configs configs;

    @Value("${limits-service.maximum}")
    private int max;

    @GetMapping("/limits")
    public Limits retriveLimits(){

        return new Limits(configs.getMinimum(), configs.getMaximum());
        //return new Limits(1,1000);
    }
}
