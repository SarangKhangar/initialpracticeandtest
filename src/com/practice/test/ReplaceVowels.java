package com.practice.test;

public class ReplaceVowels {
	
	public static void main(String[] args) {
		
		String name = "Sarang";
		
		String uName = replaceVow(name);
		
		System.out.println(uName);
		
	}
	
	public static String replaceVow(String str) {
		
		String str2 =  str.replaceAll("[aeuioAEIUO]", "*");
		return str2;
		
	}

}
