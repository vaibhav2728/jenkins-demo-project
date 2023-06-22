package com.jenkins.demo;

import jakarta.annotation.PostConstruct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkinsDemoProjectApplication {

	public static Logger logger= LoggerFactory.getLogger(JenkinsDemoProjectApplication.class);

	@PostConstruct
	public void init(){
		logger.info("Application started");
	}
	public static void main(String[] args) {
		logger.info("Application Executed");
		SpringApplication.run(JenkinsDemoProjectApplication.class, args);
	}

}
