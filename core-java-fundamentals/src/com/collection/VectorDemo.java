package com.collection;

import java.util.*;

public class VectorDemo {

	public static void main(String[] args) {
		
		Vector v1 = new Vector();				//constructor 1  
		System.out.println("capacity of default vector is " + v1.capacity());
		
		Vector v2 = new Vector(10);				//constructor 2
		System.out.println("capacity of vector2 is " + v2.capacity());
		
		Vector v3 = new Vector(5,2);			//constructor 3
		System.out.println("capacity of vector3 is " + v3.capacity());
		
		ArrayList<Integer> l = new ArrayList<Integer>();
		for(int i=1; i<=5; i++) {
			l.add(i);
		}
		
		Vector v4 = new Vector(l);				//constructor 4
		
		if(v4.containsAll(l)) {					//contains all
			System.out.println("list l is present in vector4");
		}
		
		// all list methods is applicable for vector
		v4.add(5,7);
		v4.insertElementAt(5,6);
		v4.addElement(8);						
		
		Iterator itr = v4.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("first element : " + v4.firstElement());		//first element
		System.out.println("last element : " + v4.lastElement());		//last element
		
		Collections.sort(v4);					//sorting
		System.out.println(v4);
	}
	
}
