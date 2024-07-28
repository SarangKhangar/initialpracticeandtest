package com.practice.test;

import java.util.Arrays;

public class Anagrams {
	

	public static void main(String[] args) {
		
		String str1 = "Sarang";
		
		String str2 = "ngaaSr";

		str2.toLowerCase();
		str1.toLowerCase();
		
		char[] str11 = str1.toCharArray();
		char[] str22 = str2.toCharArray();
		
		Arrays.sort(str11);
		Arrays.sort(str22);
		
		Arrays.equals(str11, str22);
		
		CharSequence str3 = str2;
		
		System.out.println(str1.contains(str3));
		
		String[] strs = {"aa", "cc", "bb"};
		
		Arrays.sort(strs);
		
		
		
	}

}
