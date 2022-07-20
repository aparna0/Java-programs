package com.Interfaces;

interface OuterInterface{
	//nested interface can created inside another interface
	interface Inner{
		void demo();
		void say1();
	}
	void outerMethod2();
	
}

class OuterClass{
	//nested interface can created inside another class
	interface Inner{
		void demo();
		void say2();
	}
	
	void outerMethod() {
		System.out.println("outer method inside outerclass.");
	}
}

public class NestedInterface extends OuterClass implements OuterInterface, OuterInterface.Inner, OuterClass.Inner{
	
	public void demo() {
		System.out.println("inner interface comman demo method is implemented.");
	}
	public void say1() {
		System.out.println("nested interface by innerface.");
	}
	public void say2() {
		System.out.println("nested interface by class.");
	}
	
	public void outerMethod2() {
		System.out.println("outer method inside outerinterface.");
	}
	public static void main(String[] args) {
		NestedInterface obj = new NestedInterface();
		obj.demo();
		obj.say1();
		obj.say2();
		obj.outerMethod();  	//this method is extended from OuterClass
		obj.outerMethod2();
	}

}
