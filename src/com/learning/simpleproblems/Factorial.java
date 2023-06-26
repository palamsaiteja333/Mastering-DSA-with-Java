package com.learning.simpleproblems;

public class Factorial {

	public static void main(String[] args) {

		int n = 5;

		int result = getFactorial(n);
		System.out.println(result);

	}

	public static int getFactorial(int n) {

		if (n == 0) {
			return 1;
		}

		else {

			return n * getFactorial(n - 1);
		}

	}

}
