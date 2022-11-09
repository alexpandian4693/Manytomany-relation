package com.springTasklet.springTasklet;

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableBatchProcessing
public class SpringTaskletApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringTaskletApplication.class, args);
	}

}
