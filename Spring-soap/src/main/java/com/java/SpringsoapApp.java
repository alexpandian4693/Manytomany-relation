package com.java;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages= { "com.java.config", "com.java.service" })
public class SpringsoapApp {
    
    public static void main(String[] args) {
        SpringApplication.run(SpringsoapApp.class, args);
    }
}