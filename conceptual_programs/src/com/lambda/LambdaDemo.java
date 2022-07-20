package com.lambda;

import java.util.*;

//lambda expression is used to write one line abbreviated function without name, modifier and return type

interface FunctionalInterface{
	void display();
}

public class LambdaDemo {

	public static void main(String[] args) {
		
		//lambda useful in collections
		List<Integer> l = new ArrayList<Integer>();
		for(int i=1; i<=5; i++) {
			l.add(i);
		}
		
		List<Integer> l2 = new ArrayList<Integer>();
		
		l.forEach(  i -> l2.add(i) );
		
		l2.forEach((i) -> {System.out.println(i);} );
		
		//implementing functional interface
		FunctionalInterface f = () -> System.out.println("This is simple lambda function.");
		f.display();
		
	}

}
