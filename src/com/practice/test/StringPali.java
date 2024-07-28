package com.practice.test;

public class StringPali {
	
	 public static void main(String[] args) {
	        
	        String name = "stts";
	        
	        System.out.println(checkStringPali(name));
	        
	        
	    }
	    
	    public static boolean checkStringPali(String str){
	        
			int left = 0;
			int right = str.length() - 1;
			
			 while (left != right && right>left) {
		            if (str.charAt(left) == str.charAt(right)) {
		                left++;
		                right--;
		            } else {
		                return false;
		            }
		        }

			return true;
		}

}
