package com.challenges.euler;

import java.math.BigInteger;

public class Question16 {

	public static void main(String[] args) {
		BigInteger number = new BigInteger("" + 2);
		number = number.pow(1000);
		int total = 0;
		for(char num : number.toString().toCharArray()) {
			total += Character.getNumericValue(num);
		}
		System.out.println(total);
	}

}
