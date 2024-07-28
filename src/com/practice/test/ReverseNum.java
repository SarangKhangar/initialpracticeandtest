package com.practice.test;

public class ReverseNum {
	
	public static void main(String[] args) {
		
		//System.out.println(revNum(50));
		revNum2(125);
	}
	
	public static int revNum(int n) {

		int oNum = n;
		int rNum = 0;
		while(n!=0) {
			
			int dig = n%10;
			rNum = rNum * 10 + dig;
			n=n/10;
			
		}
		return rNum;
	}
	
	public static void revNum2(int n) {
		
		String str = Integer.toString(n);
		String rStr = "";
		
		for(int i=0; i<str.length(); i++) {
			rStr = str.charAt(i) + rStr;
		}
		System.out.println(rStr);
		
		
	}

}
