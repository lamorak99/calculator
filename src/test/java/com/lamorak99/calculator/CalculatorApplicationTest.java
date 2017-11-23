package com.lamorak99.calculator;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
public class CalculatorApplicationTest {
	
	@Test
	public void sum() {
		CalculatorController controller = new CalculatorController();
		assertEquals(5, controller.sum(2, 3));
	}
	
	@Test
	public void multiply() {
		CalculatorController controller = new CalculatorController();
		assertEquals(6, controller.multiply(2, 3));
	}

}
