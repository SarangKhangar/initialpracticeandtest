package com.practice.test;

import java.util.LinkedList;
import java.util.List;

public class All {
	
	public static void main(String[] args) {
		
		List<Integer> lst = new LinkedList<>();
		List<Integer> lst2 = new LinkedList<>();
		
		lst.add(1);
		lst.add(2);
		lst.add(3);
		
		//lst.removeIf(a -> a%2==0);
		
		for(int i=lst.size()-1; i>=0; i--) {
			lst2.add(lst.get(i));
		}
		
		for(int n : lst2) {
			System.out.println(n);
			
		}
		
		
		
	}

}
