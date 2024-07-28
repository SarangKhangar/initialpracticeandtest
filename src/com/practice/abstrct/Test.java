package com.practice.abstrct;

public class Test extends TestAbstrct {
	
	public static void main(String[] args) {
		Test t = new Test();
		t.one();
		t.two();
		TestAbstrct.three();
	}

	@Override
	void one() {
		System.out.println("abstract implemented called");		
	}

}

abstract class TestAbstrct{
	
	abstract void one();
	
	void two() {
		System.out.println("two from abstract class called");
	}
	
	public static void three() {
		System.out.println("three from abstract called which is static");
	}
	
}
