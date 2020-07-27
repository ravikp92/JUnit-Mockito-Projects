package com.ravi.junit.binaryserach;

import java.util.EmptyStackException;
import java.util.LinkedList;

import com.ravi.junit.binaryserach.tests.EmptyArrayException;

public class MyStack<T> {

	private LinkedList<T> list = new LinkedList<>();

	public void push(T element) {
		if(list.size() ==0) 
			throw new EmptyMyStackException("Stack should not be empty!!");
		list.addLast(element);
	}

	public int size() {
		return list.size();
	}

	public T pop() {
		if(list.size() ==0) {
			throw new EmptyMyStackException("Stack should not be empty!!");
		}
		return list.removeLast();
	}

	public T peek() {
		if(list.size() ==0) {
			throw new EmptyMyStackException("Stack should not be empty!!");
		}
		return list.peekLast();
		
	}
	


}
