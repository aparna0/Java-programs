package com.markerInterface;

import java.io.Serializable;

class Demo2 implements Cloneable{
	int no;
	public Object Clone() throws CloneNotSupportedException {
		return super.clone();
	}
	public String toString() {
		return ("value is " + this.no);
	}
}

public class CloningDemo {

	public static void main(String[] args) throws CloneNotSupportedException {
		Demo2 obj1 = new Demo2();
		obj1.no = 10;
		Demo2 obj2 = (Demo2)obj1.Clone();
		System.out.println("obj1  : "+obj1);
		System.out.println("obj2  : "+obj2);
		obj1.no = 20;
		System.out.println("obj1  : "+obj1);
		System.out.println("obj2  : "+obj2);
		
	}

}
