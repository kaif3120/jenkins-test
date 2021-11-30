package com.jenkins;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkinsApplication {

	static Logger logger = LoggerFactory.getLogger(SpringApplication.class);

	@PostConstruct
	public void init(){
		logger.info("Application initialized");
	}

	public static void main(String[] args) {
		logger.info("application executing");
		SpringApplication.run(JenkinsApplication.class, args);
	}

	@PreDestroy
	public void destroy(){
		logger.info("Application initialized");
	}

}
