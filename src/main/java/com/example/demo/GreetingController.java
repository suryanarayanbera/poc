package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

	@GetMapping("/greeting")
	public String greeting(@RequestParam String name) {
		System.out.println("User entered name is: "+ name );
		return "Hello, " + name + "!";
	}

}
