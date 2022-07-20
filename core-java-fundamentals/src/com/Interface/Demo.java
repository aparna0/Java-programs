package com.Interface;

interface Interface{
	int a = 10; 					//by default variables are public final static
	void implement(String smg);		//by default methods are public abstract
	static void call() {
		System.out.println("static method inside interface");
	}
}
interface Interface1 extends Interface{		//interface can be extended
	void implement1(String smg);	
}

abstract class AbsClass implements Interface1{		//if implementing class does not define all methods then define class as abstract
	void implements1(String smg) {
		System.out.println(smg);
	}
}

interface Interface2{
	void implement(String smg);		//by default methods are public abstract
}
public class Demo implements Interface1, Interface2{
	//if both interfaces have same method then define only once in implementing class 
	public void implement(String smg) {
		System.out.println(smg);
	}
	public void implement1(String smg) {
		System.out.println(smg);
	}
	public static void main(String[] args) {
		Interface.call();
		Demo obj = new Demo();
		obj.implement("common implement method");
		obj.implement1("implement1 method of interface1");
	}

}
