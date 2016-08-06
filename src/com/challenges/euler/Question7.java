package com.challenges.euler;

public class Question7 {

	public static boolean isPrime(int num) {
		if (num == 1) {
			return false;
		} else if (num == 2) {
			return true;
		} else {
			for (int i = 2; i < num; i++) {
				if (num % i == 0) {
					return false;
				}
			}
			return true;
		}
	}
	
	public static void main(String[] args) {
		int noPrimes = 1; // Because 2 isn't counted
		int number = 1; // 3 - 2 as 2 will be added immediately
		while(noPrimes < 10001) {
			number += 2;
			if(isPrime(number)) {
				noPrimes++;
			}
		}
		System.out.println(number);
	}

}
