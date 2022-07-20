package com.Interfaces;

interface Functional{
	void fun();
}
public class FunctionalInterface {

	public static void main(String[] args) {
		Functional f = new Functional() {
			public void fun() {
				System.out.println("This is function interface method");
			}
		};
		
		f.fun();
	}

}
