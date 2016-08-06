package com.challenges.euler;

public class Question4 {
	
	public static boolean isPalin(int x) {
		String num = Integer.toString(x);
		if (new StringBuilder(num).reverse().toString().equals(num)) {
			return true;
		} else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		int largest = 0;
		for (int num1 = 100; num1 < 1000; num1++) {
			for (int num2 = 100; num2 < 1000; num2++) {
				if (isPalin(num1 * num2) && num1 * num2 > largest) {
					largest = num1 * num2;
				}
			}
		}
		System.out.println(largest);
	}
}

