package com.challenges.euler;

public class Question5 {

	public static void main(String[] args) {
		int x = 20;
		boolean solved = false;
		while(!solved) {
			for(int i = 2; i <= 20; i++) {
				if(x % i != 0) {
					break;
				} else if(i == 20) {
					System.out.println(x);
					solved = true;
				} 
			}
			x += 20;
		}
	}	
}
