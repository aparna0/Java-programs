package com.collection;

import java.util.*;

//same as HashSet but maintains insertion order  
public class LinkedHashSetDemo {

	public static void main(String[] args) {
		LinkedHashSet hs = new LinkedHashSet();
		hs.add(10);
		hs.add(55);
		hs.add(5);
		hs.add("Aparna");
		
		if(hs.add("aparna")) {
			System.out.println("Inserted");
		}
		else {
			System.out.println("Duplicate");
		}
		
		if(hs.add(5)) {
			System.out.println("Inserted");
		}
		else {
			System.out.println("Duplicate");
		}
		
		System.out.println(hs);
	}

}
