package com.xyc.zuul_client.config;

import com.xyc.zuul_client.filter.LoginFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ZuulConfig {
    @Bean
    public LoginFilter getLoginFilter(){
        return new LoginFilter();
    }
}
