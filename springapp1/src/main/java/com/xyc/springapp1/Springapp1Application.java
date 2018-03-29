package com.xyc.springapp1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Springapp1Application {

	public static void main(String[] args) {
		SpringApplication.run(Springapp1Application.class, args);
	}
}
