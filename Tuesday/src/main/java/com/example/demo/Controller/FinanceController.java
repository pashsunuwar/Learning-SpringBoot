package com.example.demo.Controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Finance")
public class FinanceController {

	
	@GetMapping("/message")
	public String message1() {
		return " GET request recieved, First annotate the public class @RestController and @RequestMapping('/Finance') This means the methods established in this class will always output as 'localhost:XXXX/Finance/...' ";
	}
	
	@PostMapping("/message")
	public String message2() {
		return " POST request recieved";
	}
	
	@DeleteMapping("/message")
	public String message3() {
		return "DELETE request recieved";
	}
	
}
