package com.practice.test;

import java.util.ArrayList;
import java.util.List;

public class StringSaperation {
	
	public static void main(String[] args) {
		
		String name = "Sarang Manoj Khangar";
		
		String[] str = name.split(" ");
		
		List<String> strList = new ArrayList<>();
		
		for(String ss : str) {
			//System.out.println(ss);
			strList.add(ss);
			
		}
		
		strList.forEach(n -> System.out.println(n));
		
		
	}

}
