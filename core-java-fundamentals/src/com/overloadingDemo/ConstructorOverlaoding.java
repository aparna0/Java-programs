package com.overloadingDemo;
/*
 when program did not written any constructor then java provides default constructor which perform initialization
 set int -> 0
 set float -> 0.0
 set string -> null
 boolean -> false
 
 if programmer written any constructor then java does not provide default constructor
 
 it better to write constructor by programmer as per requirement
 */
public class ConstructorOverlaoding {
	int no1, no2;
	public ConstructorOverlaoding() {
		no1 = 10;
		no2 = 20;
	}
	public ConstructorOverlaoding(int no1) {
		this.no1 = no1;
		no2 = 20;
	}
	public ConstructorOverlaoding(int no1, int no2) {
		this.no1 = no1;
		this.no2 = no2;
	}
	public ConstructorOverlaoding(ConstructorOverlaoding obj) {
		this.no1 = obj.no1;
		this.no2 = obj.no2;
	}
	public String toString() {
		return ("no1 : "+this.no1+"\nno2 : "+this.no2+"\n");
	}
	 
	public static void main(String args[]) {
		ConstructorOverlaoding obj1 = new ConstructorOverlaoding();
		System.out.println(obj1);
		ConstructorOverlaoding obj2 = new ConstructorOverlaoding(50);
		System.out.println(obj2);
		ConstructorOverlaoding obj3 = new ConstructorOverlaoding(70,80);
		System.out.println(obj3);
		ConstructorOverlaoding obj4 = new ConstructorOverlaoding(obj3);
		System.out.println(obj4);
	}
}
