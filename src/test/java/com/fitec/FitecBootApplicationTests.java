package com.fitec;

import com.fitec.service.Calculator;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class FitecBootApplicationTests {

	private Calculator calculator = new Calculator();

	@Test
	public void testSum() {
		assertEquals(45, calculator.sum(20, 25));
	}

}
