package com.challenges.euler;

public class Question14 {

	public static long iterate(long number) {
		if (number % 2 == 0) {
			return number / 2;
		} else {
			return (number * 3) + 1;
		}
	}
	
	public static void main(String[] args) {
		int largest[] = {1, 1}; // First number is the starting number, second number is the length
		for(int number = 2; number < 1000000; number++) {
			System.out.println(number);
			int sequenceSize = 1;
			long sequenceInt = number;
			while(sequenceInt != 1) {
				sequenceInt = iterate(sequenceInt);
				sequenceSize++;
			}
			if(sequenceSize > largest[1]) {
				largest[0] = number;
				largest[1] = sequenceSize;
			}
		}
		System.out.println(largest[0]);
		System.out.println(largest[1]);
	}
}
