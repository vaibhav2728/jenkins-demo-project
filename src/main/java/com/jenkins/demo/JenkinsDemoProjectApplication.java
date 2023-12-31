package com.jenkins.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class JenkinsDemoProjectApplication {

	public static Logger logger= LoggerFactory.getLogger(JenkinsDemoProjectApplication.class);

	@PostConstruct
	public void init(){
		logger.info("Application started on port 8081");
	}
	public static void main(String[] args) {
		logger.info("Application Executed");
		SpringApplication.run(JenkinsDemoProjectApplication.class, args);
	}

}
