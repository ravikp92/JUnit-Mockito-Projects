package com.ravi.junit.binaryserach.tests;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import com.ravi.junit.binaryserach.EmptyMyStackException;
import com.ravi.junit.binaryserach.MyStack;

public class MyStackTest {

	/*
	 * @Test public void test() { fail("Not yet implemented"); }
	 */

	MyStack<Integer> stack;

	// this method will be called before every method
	@Before
	public void setup() {
		// we can have multiple stack object with different datattype
		stack = new MyStack<Integer>();
	}

	@Test
	@Category(SmokeTest.class)
	public void newStackSizeisZero() {
		assertEquals(0, stack.size());
	}

	@Test(expected = EmptyMyStackException.class)
	@Category(SmokeTest.class)
	public void shouldAddElementByPushOperationAndChangeStackSizeByOne() {

		stack.push(10);
		stack.push(20);
		stack.push(30);

		assertEquals(3, stack.size());

	}

	@Test(expected = EmptyMyStackException.class)
	@Category(SanityTest.class)
	public void shouldRemoveTopMostELementAndReturn() {
		stack.push(10);
		stack.push(20);
		stack.push(30);

		assertEquals((Integer) 30, stack.pop());
		stack.pop();
		assertEquals(1, stack.size());
	}

	@Test(expected = EmptyMyStackException.class)
	@Category(SanityTest.class)
	public void shouldReturnTopMostElementWithoutRemovingTopElement() {
		stack.push(10);
		stack.push(20);
		stack.push(30);

		assertEquals((Integer) 30, stack.peek());
		stack.peek();
		assertEquals(3, stack.size());
	}

	@Test(expected = EmptyMyStackException.class)
	public void popOperationShouldThrowExcecption() {
		stack.pop();
	}

	@Test(expected = EmptyMyStackException.class)
	public void peekOperationShouldThrowExcecption() {
		stack.peek();
	}
	
	@After
	public void tearDown() {
		stack=null;
	}
}
