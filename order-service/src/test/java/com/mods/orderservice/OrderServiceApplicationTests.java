package com.mods.orderservice;

import com.mods.orderservice.beans.Calculator;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.system.CapturedOutput;
import org.springframework.boot.test.system.OutputCaptureExtension;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
@ExtendWith(OutputCaptureExtension.class)
class OrderServiceApplicationTests {

	@Autowired
	private Calculator calculator;
	@Test
	public void doingDivisionShouldFail() {
		assertThrows(IllegalArgumentException.class,
				() -> calculator.calculate(12,13, '/'));
	}

	@Test
	public void doingMultiplicationShouldSucceed(CapturedOutput capture) {
		calculator.calculate(12,13, '*');
		assertTrue(capture.getOut().contains("12 * 13 = 156"));
	}
}
