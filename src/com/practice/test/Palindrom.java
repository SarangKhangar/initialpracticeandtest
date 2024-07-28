package com.practice.test;

import java.util.List;

public class Palindrom {
	
	
	public static void main(String[] args) {
		
			int n = 123;
			int n2 = 123;
	
			int[] nums = {121,123};
			List<Integer> intList = (List.of(121,123));
			
			System.out.println(checkByConverting(n));
			
		
	}
	
//	public static boolean checkPalindrom(int num) {
//		
//		int oNum = num;
//		int rNum = 0;
//		while(num!=0) {
//			
//			int dig = num%10;
//			rNum = rNum * 10 + dig;
//			num=num/10;
//			
//		}
//		
//		return oNum==rNum;
//		
//	}
	
	public static boolean checkByConverting(int n) {
		int oNum=n;
		System.out.println(n);
		System.out.println(oNum);
		String s = String.valueOf(n);
		System.out.println(s);
		StringBuilder sb = new StringBuilder(s);
		System.out.println(sb);
		String sre = Integer.toString(n);
		String name = "12345";
		int nt = Integer.parseInt(name);
		
		System.out.println(sb.reverse() + " reverse");
		System.out.println(sb);
		return sb.equals(oNum);
		
		
	}

}
















