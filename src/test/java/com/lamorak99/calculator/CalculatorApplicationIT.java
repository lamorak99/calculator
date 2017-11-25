package com.lamorak99.calculator;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.Assert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.junit4.SpringRunner;

import com.lamorak99.calculator.controller.CalculatorController;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment=WebEnvironment.MOCK)
public class CalculatorApplicationIT {
	
	@Autowired
	CalculatorController calculator;

	@Test
	public void contextLoads() {
		Assert.assertNotNull(calculator);
	}

}
