package com.practice.test;

import java.util.ArrayList;
import java.util.List;

public class Fibonaccie {
	
	public static void main(String[] args) {
		
		//series(5);
		System.out.println(series(5));
		
	}

	public static List<Integer> series(int num){
		
		int n1 = 1;
		int n2 = 2;
		
		List<Integer> series = new ArrayList<>();
		series.add(n1);
		series.add(n2);
		
		for(int i=1; i<=num-2; i++) {
			int n3 = n1+n2;
			series.add(n3);
			n1=n2;
			n2=n3;
			
		}
		return series;
	}
	
}
