package com.optebiz.microservice;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MicroserviceExampleApplication {
    public static void main(String[] args) {
//        System.setProperty("spring.config.name", "eureka-server");
        SpringApplication.run(MicroserviceExampleApplication.class, args);
    }
}