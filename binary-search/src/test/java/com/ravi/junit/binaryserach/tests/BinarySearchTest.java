package com.ravi.junit.binaryserach.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import com.ravi.junit.binaryserach.tests.BinarySearch;
import com.ravi.junit.binaryserach.tests.EmptyArrayException;

public class BinarySearchTest {

	/*
	 * @Test public void test() { fail("Not yet implemented"); }
	 */

	@Test
	public void testArrayOddElementsAndSearchReturnsIndexOfKey() {
		int data[] = { 11, 22, 33, 44, 55, 66, 77 };
		int key = 22;

		assertEquals(1, BinarySearch.search(data, key, 0, data.length - 1));
	}

	@Test
	public void testArrayEvenElementsAndSearchReturnsIndexOfKey() {
		int data[] = { 11, 22, 33, 44, 55, 77 };
		int key = 77;

		assertEquals(5, BinarySearch.search(data, key, 0, data.length - 1));
	}

	@Test
	public void shouldReturnNegativeIndexIfNotPresent() {
		int data[] = { 11, 22, 33, 44, 55, 77 };
		int key = 54;

		assertEquals(-1, BinarySearch.search(data, key, 0, data.length - 1));
	}

	@Test(expected = EmptyArrayException.class)
	public void shouldThrowExceptionifInputArrayIsEmpty() {
		int data[] = {};
		int key = 54;

		assertEquals(-1, BinarySearch.search(data, key, 0, data.length - 1));
	}

}
