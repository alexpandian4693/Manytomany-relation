package com.java.starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableAutoConfiguration

@ComponentScan(basePackages= {"package com.java.controller"})
public class SpringbootCountryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootCountryServiceApplication.class, args);
		System.out.println("application started");
	}

}
