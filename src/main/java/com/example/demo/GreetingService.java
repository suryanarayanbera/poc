package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class GreetingService {

	private static final Logger log = LoggerFactory.getLogger(GreetingService.class);

	private static final String GREETING_SUFFIX = ", welcome to the demo!";

	public void logName(String name) {
		log.info("User entered name = {}", name);
		System.out.println("User entered name = " + name);
		System.out.println("User entered name = " + name);
		//TODO: Add more logic here if needed
		//TODO: Add more logic here if needed
		//TODO: Add more logic here if needed
	}

	public String appendGreeting(String name) {
		return name + GREETING_SUFFIX;
	}

}
