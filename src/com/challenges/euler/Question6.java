package com.challenges.euler;

public class Question6 {

	public static void main(String[] args) {
		long sumOfSquare = 0;
		long squareOfSum = (long) Math.pow(101 * 50, 2);
		for (int i = 1; i < 101; i++) {
			sumOfSquare += i * i;
		}
		System.out.println(squareOfSum - sumOfSquare);
	}

}
