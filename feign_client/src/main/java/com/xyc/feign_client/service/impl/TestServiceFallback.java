package com.xyc.feign_client.service.impl;

import com.xyc.feign_client.service.TestService;
import org.springframework.stereotype.Component;

@Component
public class TestServiceFallback implements TestService {
    @Override
    public String test(String para) {
        System.out.println("gg:"+para);
        return  "gg";
    }
}
