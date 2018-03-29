package com.xyc.feign_client.service;

import com.xyc.feign_client.service.impl.TestServiceFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(name="app1",fallback = TestServiceFallback.class)
public interface TestService {
    @GetMapping("/app1")
    public String test(String s);
}
