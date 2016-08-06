package com.challenges.euler;

public class Question3 {

	public static boolean isPrime(long x) {
		if(x == 1) {
			return false;
		} else if(x == 2) {
			return true;
		} else {
			for(int i = 2; i < x; i++) {
				if(x % i == 0) {
					return false;
				}
			}
			return true;
		}
	}
	
	public static void main(String[] args) {
		long remainder = 600851475143L;
		long bigestPrime = 0;
		while(true) {
			for(int i = 3; i <= remainder; i += 2) {
				if (isPrime(i) && remainder % i == 0) {
					bigestPrime = i;
					remainder /= i;
					break;
				}
			}
			if(isPrime(remainder)) {
				bigestPrime = remainder;
				break;
			}
		}
		System.out.println(bigestPrime);

	}
}
