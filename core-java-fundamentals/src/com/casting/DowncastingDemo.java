package com.casting;

public class DowncastingDemo {
	
	class ParentDemo{
		int parent_var;
		public void print() {
			System.out.println("Prent method");
		}
	}
	class ChildDemo extends ParentDemo{
		int child_var;
		public void print() {
			System.out.println("Child method");
		}
	}

	public static void main(String[] args) {
		//ChildDemo c = (ChildDemo) new ParentDemo();   implicit downcasting not allowed throws ClassCastException
		
		Parent p = new Child();
		Child c = (Child) p;
		
		
		c.parent_var = 10;
		c.child_var = 11;
		System.out.println(c.parent_var);
		System.out.println(c.child_var);
		c.print();
	}

}
