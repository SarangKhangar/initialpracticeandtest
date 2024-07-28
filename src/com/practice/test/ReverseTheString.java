package com.practice.test;

import java.util.Vector;

public class ReverseTheString {

	    public static void main(String[] args) {
	    	
	    	Vector<Integer> vtr = new Vector<>();
	    	vtr.add(1);
	    	vtr.add(1);
	    	vtr.add(1);
	    	vtr.add(1);
	    	vtr.add(1);
	    	vtr.add(1);
	    	vtr.add(1);
	    	vtr.add(1);
	    	vtr.add(1);
	    	vtr.add(1);
	    	vtr.add(1);
	        System.out.println(vtr.size());
	        System.out.println(vtr.capacity());
	    	
	        String original = "hello";
	        String reversed = reverseString(original);
	        System.out.println("Original string: " + original);
	        System.out.println("Reversed string: " + reversed);
	    }

	    public static String reverseString(String str) {
	        StringBuilder reversed = new StringBuilder();
	        for (int i = str.length() - 1; i >= 0; i--) {
	            reversed.append(str.charAt(i));
	        }
	        return reversed.toString();
	    }
	

	
}
