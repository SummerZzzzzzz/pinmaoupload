package com.softtron.pinmaoupload.configs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration
@ComponentScan(basePackages= {"com.softtron.pinmaoupload"})
public class Init {
	public static void main(String[] args) throws Exception {
		SpringApplication.run(Init.class, args);
	}
}
