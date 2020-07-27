package com.ravi.junit.binaryserach.tests;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestFixedOrderMethodTest {

	@Test
	public void testA() {
		System.out.println("A");
	}
	@Test
	public void testC() {
		System.out.println("C");
	}
	@Test
	public void testB() {
		System.out.println("B");
	}
}
