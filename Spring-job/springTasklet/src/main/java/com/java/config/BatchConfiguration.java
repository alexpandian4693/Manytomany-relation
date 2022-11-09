package com.java.config;


import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BatchConfiguration {
	@Autowired JobBuilderFactory jobbuild;
	
	@Autowired StepBuilderFactory steps;
	
	@Bean
	public Job job1() {
		return jobbuild.get("job1").start(step1()).build();
	}
	@Bean
	public Step step1() {
		return steps.get("step1").tasklet(new Tasklet1()).build();
		
	}
	
	
	
	

}
