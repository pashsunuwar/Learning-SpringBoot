package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Maths {
	
	public int add(int a, int b) {
		return a+b;
	}
	
	public int sub(int a, int b) {
		return a-b;
	}
	
	public int mul(int a, int b) {
		return a*b;
	}
		
	public int div(int a, int b) {
		return a/b;
	}
		
}
