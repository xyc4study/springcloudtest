package com.xyc.feign_client.controller;

import com.xyc.feign_client.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class TestController {
    @Autowired
    TestService service;
    @GetMapping("/test")
    public String test(@RequestParam("s") String para){
        return service.test(para);
    }
}
