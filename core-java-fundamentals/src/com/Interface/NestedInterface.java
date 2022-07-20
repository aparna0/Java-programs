package com.Interface;

//interface can define inside another class
class Outer{
	public void outer() {
		System.out.println("outer method of class");
	}
	interface Inner{
		void inner();
	}
}
//interface can define inside another interface
interface OuterInterface{
	public void outerInterface();
	interface Inner{
		void inner();
	}
}

//this class only implements Inner interface of Outer class
class PQClass implements Outer.Inner{
	public void inner() {
		System.out.println("inner method of Inner interface");
	}
}
//this class only extends Outer class
class RSClass extends Outer{
	
}
//this class extends outer class and implements inner interface
class ABClass extends Outer implements Outer.Inner{
	public void inner() {
		System.out.println("inner method of Inner interface");
	}
}

//this class implements only outer interface
class XYZ implements OuterInterface{
	public void outerInterface() {
	
	}
	
}
//this class implements only inner interface
class PQR implements OuterInterface.Inner{
	
	@Override
	public void inner() {
		
	}
	
}

class PQRClass implements OuterInterface, OuterInterface.Inner{

	@Override
	public void inner() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void outerInterface() {
		// TODO Auto-generated method stub
		
	}
	
}
public class NestedInterface {

	public static void main(String[] args) {
		
	}

}
