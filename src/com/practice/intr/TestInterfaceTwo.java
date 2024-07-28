package com.practice.intr;
//we can override the default method of interface
interface A {
	
	default void methodOne() {
		System.out.println("one");
	}
	
}

public class TestInterfaceTwo implements A {
	
	public static void main(String[] args) {
		
		TestInterfaceTwo ti = new TestInterfaceTwo();
		ti.methodOne();
	}
	
	@Override
	public void methodOne() {
		// TODO Auto-generated method stub
		System.out.println("from overriden");
		A.super.methodOne();
	}

}
