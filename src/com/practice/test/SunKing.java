package com.practice.test;

import java.util.ArrayList;
import java.util.List;

public class SunKing {

	public static void main(String args[]){

		int[] A = { 3, -1, 1, 0, 2 };
		int S = 4;

		System.out.println(mathOperation(A, S));
		System.out.println("Rocks");

		}

	public static List<Integer> mathOperation(int[] A, int S){

		int t = 0;
		List<Integer> res = new ArrayList();
		res.add(-1);
		res.add(-1);
		        
		List<Integer> result = new ArrayList<>();
		for (int i = 0; i < A.length; i++) {
			if (i == A.length - 1) {
				break;
			}
			for (int j = i + 1; j < A.length; j++) {
				t = A[i] + A[j];

				if (t == S) {
					result.add(i);
					result.add(j);
					return result;
				}
			}
			
			if (t == S) {
				break;
			}
			
		}

		return res;

		}

}
