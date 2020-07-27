package com.ravi.junit5.test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

import java.util.Collection;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;
import org.junit.runner.OrderWith;

import com.ravi.junit5.Calculator;

@DisplayName("Test class")
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@EnabledOnOs(OS.LINUX)
public class CalculatorTest {


	@Test
	@DisplayName("Test Addition with positive integer")
	@Order(2)
	public void testAddWith2PositiveIntegers() {
		int result = Calculator.addition(12,24);
		//// below came due to static import without
		//need to define Assert class.
		assertEquals(36, result); 
	}
	
	@Test
	@DisplayName("Test Addition with negative integer")
	@Order(1)
	public void testAddWith2NegativeIntegers() {
		int result = Calculator.addition(-12,-24);
		//// below came due to static import without
		//need to define Assert class.
		assertEquals(-36, result); 
	}
	

	@Test
	@Order(3)
	public void testMultiplication() {
		assertAll(
				() -> assertEquals(24, Calculator.multiply(6, 4)),
				() -> assertEquals(0, Calculator.multiply(12,0)),
				() -> assertEquals(-2, Calculator.multiply(-1, 2))
				);
	}
	
	@Test
	public void testDivisionWithException() {
		assertThrows(ArithmeticException.class, () -> Calculator.division(10,1));
	}
	
	@RepeatedTest(value = 3)
	public void testDivision(RepetitionInfo info) {
		info.getCurrentRepetition();
		info.getTotalRepetitions();
		int number1 =-1;
		boolean flag =false;
		if(number1>2) {
			flag=true;
		}
		assumeTrue(flag);
		assertEquals(80, Calculator.multiply(number1, 4));
	}
	
}
