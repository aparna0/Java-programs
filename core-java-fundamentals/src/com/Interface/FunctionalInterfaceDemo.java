package com.Interface;

//functional interface is interface with only one method
interface FunInterface{
	void display();
}
public class FunctionalInterfaceDemo {

	public static void main(String[] args) {
		FunInterface in1 = new FunInterface() {
			public void display() {
				System.out.println("function interface is implemented by annonymous class");
			}
		};
		in1.display();
		
		FunInterface in2 = () -> System.out.println("function interface is implemented by annonymous class with lambda expression");
		in2.display();
	}

}
