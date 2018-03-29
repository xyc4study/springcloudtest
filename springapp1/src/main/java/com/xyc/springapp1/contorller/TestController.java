package com.xyc.springapp1.contorller;

import org.springframework.web.bind.annotation.*;

@RestController
public class TestController {
    @GetMapping("/app1")
    public String test(@RequestParam("s") String para){
        System.out.println(para);
        return para;
    }
}
