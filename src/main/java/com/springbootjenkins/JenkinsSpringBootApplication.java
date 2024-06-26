package com.springbootjenkins;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class JenkinsSpringBootApplication {

	public static Logger logger = LoggerFactory.getLogger(JenkinsSpringBootApplication.class);

	@PostConstruct
	public void message() {

		logger.info("Application Strarted");
	}

	public static void main(String[] args) {

		logger.info("Application executed");
		SpringApplication.run(JenkinsSpringBootApplication.class, args);
	}

}
