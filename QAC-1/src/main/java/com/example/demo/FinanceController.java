package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/finace")
public class FinanceController {
	
	@RequestMapping(value="/finance/tax/{salary}", method=RequestMethod.GET)
	public void tax() {
		
	}

}
