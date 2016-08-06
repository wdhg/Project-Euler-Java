package com.challenges.euler;

public class Question1 {
	
	public static int sum(int max, int step) {
		int total = 0;
		for(int num = 0; num < max; num += step) {
			total += num;
		}
		return total;
	}
	
	public static void main(String[] args) {
		int max = 1000;
		System.out.println(sum(max, 3) + sum(max, 5) - (sum(max, 15)));
	}

}
