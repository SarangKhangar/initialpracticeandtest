package com.practice.test;

public class Factorial {
	
	public static void main(String[] args) {
		
		int a = 5;
		
		System.out.println(factorial(a));
		
	}
	
	public static int factorial(int num) {
		int ans = 1;
		for(int i=num; i>=1; i--) {
			ans *= i;
		}
		
		return ans;
	}

}
