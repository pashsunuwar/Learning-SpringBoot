package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class First {
	
	@Autowired
	Maths ref;
	
	@RequestMapping(value="/", method= RequestMethod.GET)
	public String home() {		
//		select query
		return "Welcome to my HOME page";
	}
	
	@RequestMapping(value="/aboutUs", method= RequestMethod.POST)
	public String aboutUs() {
		return "We provide technical training";
	}
	
	@RequestMapping(value="/trainers", method= RequestMethod.POST)
	public String trainers() {
		return "Vinesh, Alan, Shafeeq";
	}

	@RequestMapping(value="/hello", method= RequestMethod.PUT)
	public String hello() {
		return "Hello world";
	}
	
	@RequestMapping(value="/london", method= RequestMethod.DELETE)
	public String london3() {
		return "Welcome to London DELETE";
	}
	
	@RequestMapping(value="/QA")
	public String manchester() {
		return "Welcome to Manchester";
	}
	
	
//	
	@RequestMapping(value="/msg/{name}", method=RequestMethod.GET)
	public String msg(@PathVariable(value="name")String studentname) {
		return "Hello msg" + studentname;
	}
	@RequestMapping(value="/info/{name}/{address}", method=RequestMethod.GET)
	public String info(@PathVariable(value="name")String name2, @PathVariable(value="address") String Address2) {
		
		String message= name2 + " lives in " + Address2;
		return message;
	}
	
//	@RequestMapping(value="/maths/{opt}/{a}/{b}", method=RequestMethod.GET)
//	public String calc(@PathVariable(value="a")int a1, @PathVariable(value="b")int b1) {
//		Maths ref = new Maths();
//		int result = 0;
//		if (opt.equals("add"))
//			result = ref.add(a1, b1);
//			
//		String opt = null;
//		switch (opt) {
//		case "add":
//			return a1+b1;	
//		}	
//		
//	}
				

	

}