package com.casting;

class Parent{
	int parent_var;
	public void print() {
		System.out.println("Prent method");
	}
}
class Child extends Parent{
	int child_var;
	public void print() {
		System.out.println("Child method");
	}
}
public class UpcastingDemo {

	public static void main(String[] args) {
		
		//Parent p = new Child();
		Parent p = (Child)new Child();
		
		p.print();
		
		p.parent_var = 10;
		//p.child_var = 11;    child member variable is not accessible 
							 //parent all members and child overriden methods is accessible
	}

	// P is reference of parent class but holding child class object, therefore it access only parent class members
	// but an method of parent class is overriden then it will call overriden ethod from child class
}
