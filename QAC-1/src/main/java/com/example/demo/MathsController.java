package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping (value="/maths")
public class MathsController {

	@Autowired
	Maths ref;
	
	@RequestMapping(value="/add/{x}/{y}", method=RequestMethod.GET)
	public String add(@PathVariable("x")int a, @PathVariable("y")int b) {
		return "Result: " + ref.add(a, b);
	}
}
