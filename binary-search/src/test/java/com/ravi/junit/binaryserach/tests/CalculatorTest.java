package com.ravi.junit.binaryserach.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.ravi.junit.binaryserach.Calculator;

/**
 * Unit Test Cases for Calculator Class
 * @author RaviP
 *
 */
public class CalculatorTest {

	@Test
	public void testAddWith2PositiveIntegers() {
		int result = Calculator.addition(12,24);
		//// below came due to static import without
		//need to define Assert class.
		assertEquals(36, result); 
	}
	
	@Test
	public void testAddWith2NegativeIntegers() {
		int result = Calculator.addition(-12,-24);
		//// below came due to static import without
		//need to define Assert class.
		assertEquals(-36, result); 
	}
}
