package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Finance {
	
	public float tax(int salary) {
		
		float X = salary * 20/100;
		return X;
		
	}

}
