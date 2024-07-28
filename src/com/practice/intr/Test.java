package com.practice.intr;

public class Test implements TestInter{
	
	public static void main(String[] args) {
		Test t = new Test();
		t.one();
		t.three();
		TestInter.two();
	}

	@Override
	public void one() {
		System.out.println("abstract from this called");
		
	}
	
}

interface TestInter {
	
	void one();
	
	public static void two() {
		System.out.println("static method two called");
	}
	
	default void three() {
		System.out.println("default method three called");
	}

}
