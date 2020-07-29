package com.example.demo.Controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/First")
class FirstController {
	
	@GetMapping
	public String message1() {
		return " First recieved the GET request ";
	}
	
	@PostMapping
	public String message2() {
		return " First recieved the POST request ";
	}
	
	@DeleteMapping
	public String message3() {
		return " First recieved the DELETE request ";
	}


}
