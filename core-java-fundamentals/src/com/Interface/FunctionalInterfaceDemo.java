package com.Interface;

//functional interface is interface with only one method but can have multiple default and static methods
//function interface annotated with @FunctionalInterface(optional) to ensure interface doesn't breaks functional interface rule.
interface FunInterface{
	void display();
	default void defaultMethod(){
		System.out.println("it is default methhod");
	}
	static void StaticMethod(){
		System.out.println("it is default methhod");
	}
}
public class FunctionalInterfaceDemo {

	public static void main(String[] args) {
		FunInterface in1 = new FunInterface() {
		public void display() {
			System.out.println("function interface is implemented by annonymous class");
		}
		};
		in1.display();
		FunInterface.staticMethod();
		
		
		FunInterface in2 = () -> System.out.println("function interface is implemented by annonymous class with lambda expression");
		in2.display();
        	in2.defaultMethod();
	}

}
