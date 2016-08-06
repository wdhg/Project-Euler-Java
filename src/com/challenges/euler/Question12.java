package com.challenges.euler;

public class Question12 {

	public static int triangle(int n) {
		return ((n * n) + n) / 2;
	}
	
	public static int getDivisors(int x) {
		int divisors = 0;
		for(int divisor = 1; divisor < Math.sqrt(x); divisor++) {
			if(x % divisor == 0) {
				divisors += 2;
			}
		}
		return divisors;
	}
	
	public static void main(String[] args) {
		int number = 1;
		while(true) {
			if(getDivisors(triangle(number)) > 500) {
				System.out.println(triangle(number));
				System.out.println(number);
				break;
			} else {
				number++;
			}
		}
	}

}
