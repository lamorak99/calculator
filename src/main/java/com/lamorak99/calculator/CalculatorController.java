package com.lamorak99.calculator;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

	//http://localhost:8080/sum?a=1&b=2
	@RequestMapping (path="/sum", method=RequestMethod.GET)
	public int sum(@RequestParam int a, @RequestParam int b) {
		return a+b;
	}
	//http://localhost:8080/multiply?a=1&b=2
	@RequestMapping (path="/multiply", method=RequestMethod.GET)
	public int multiply(@RequestParam int a, @RequestParam int b) {
		return a*b;
	}
}


