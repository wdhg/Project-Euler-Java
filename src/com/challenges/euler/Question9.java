package com.challenges.euler;

public class Question9 {
	
	public static void checkTriplet(int num1, int num2) {
		int square = (num1 * num1) + (num2 * num2);
		float num3 = (float) Math.sqrt(square);
		if (num3 == (int) num3) { // Num3 is integer
			if (num1 + num2 + num3 == 1000) {
				long x = (long) (num1 * num2 * num3);
				System.out.println(x);
			}
		}
	}
	
	public static void main(String[] args) {
		for(int num1 = 1; num1 < 1000; num1++) {
			for(int num2 = 1; num2 < 1000; num2++) {
				checkTriplet(num1, num2);
			}
		}
	}
}