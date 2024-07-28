package com.practice.test;

public class Digicount {
	
	public static void main(String[] args) {
		
		int num = 12345;
		int count = countDigi(num);
		System.out.println(count);
		
	}
	
	public static int countDigi(int a) {
		
		int cnt = 0;
		
		if(a==0) {
			return 1;
		}
		
		while(a!=0) {
			a=a/10;
			cnt++;
		}
		return cnt;
	}

}
