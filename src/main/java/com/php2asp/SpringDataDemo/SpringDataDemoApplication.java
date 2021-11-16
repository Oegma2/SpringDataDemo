package com.php2asp.SpringDataDemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringDataDemoApplication {
	private static final Logger logger = LoggerFactory.getLogger(SpringDataDemoApplication.class);

	public static void main(String[] args) {
		logger.info("Main application V0.0.1 starting up");
		SpringApplication.run(SpringDataDemoApplication.class, args);
	}

}
