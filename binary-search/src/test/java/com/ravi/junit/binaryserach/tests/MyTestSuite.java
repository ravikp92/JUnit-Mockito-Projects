package com.ravi.junit.binaryserach.tests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses(
		{
			BinarySearchTest.class,
			MyStackTest.class,
			CalculatorTest.class
		})
public class MyTestSuite {

}
