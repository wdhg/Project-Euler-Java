package com.challenges.euler;

public class Question2 {
	public static int fibonacci(int x) {
		if(x < 2) {
			return x;
		} else {
			return fibonacci(x - 1) + fibonacci(x - 2);
		}
	}
	
	public static void main(String[] args) {
		int total = 0;
		int number = 1;
		while(true) {
			int fibNumber = fibonacci(number);
			if (fibNumber >= 4000000) {
				break;
			} else if(fibNumber % 2 == 0) {
				total += fibNumber;
			}
			number++;
		}
		System.out.println(total);
	}
	
}
