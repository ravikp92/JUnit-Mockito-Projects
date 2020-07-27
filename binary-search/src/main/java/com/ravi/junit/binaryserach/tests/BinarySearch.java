package com.ravi.junit.binaryserach.tests;

public class BinarySearch {

	public static int search(int[] data, int key, int low, int high) {
		
		if(data.length ==0 ) {
			throw new EmptyArrayException("Array should not be empty");
		}
		
		if(low > high) {
			return -1;
		}
		
		int mid= (low + high)/2;		
		if(key== data[mid]) {
			return mid;
		}else if(key > data[mid]) {
			low= mid+1;
			return search(data,key,low,high);
		}else if(key < data[mid]) {
			high= mid-1;
			return search(data,key, low,high);
		}
		return -1;
		
	}

}
