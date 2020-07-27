package com.ravi.junit.binaryserach;

public class MathUtils {

	public static long power(int x, int y) {

		if (y == 0)
			return 1;
		else
			return x * power(x, y - 1);
	}
}
