package com.ravi.junit.binaryserach.tests;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.ravi.junit.binaryserach.MathUtils;

@RunWith(Parameterized.class)
public class MathUtilsTest {

	/*
	 * Program to write generic x power of y.
	 */


	public int x;
	

	public int y;
	

	public long result;
	
	public MathUtilsTest(int x, int y, long result) {
		this.x=x;
		this.y=y;
		this.result=result;
	}
	@Parameters
	public static List inputData() {
		return Arrays.asList(new Object[][] {
			{2,5,32},
			{3,3,27},
			{5,2,25},
			{3,4,81}
			});
		
	}
	
	@Test
	public void testPowerOperation() {
		assertEquals(result,MathUtils.power(x,y));
	}
}
