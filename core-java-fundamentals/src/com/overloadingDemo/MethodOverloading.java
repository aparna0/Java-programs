package com.overloadingDemo;
/*
 when function name is same but signature is different then it is called as methodoverloading
 when we need function haveing same functionality but needs to be perform for different types 
 then we can use method overlaoding
 methods in java.lang.Math class
 */

public class MethodOverloading {
	public int sum(int no1, int no2) {
		return (no1+no2);
	}
	
	/*
	public int sum(int no1, int no2) {	        //Not allowed because function have same signature
		return (no1+no2);                       //i.e fuction with same type and number of parameter is allready dfined above
	}
	*/		
	
	public int sum(int no1, int no2, int no3) {   //allowed because different number of arguments
		return (no1+no2+no3);
	}
	
	/*
	public float sum(int no1, int no2) {       //Not allowed even if return type is different
		return (no1+no2);					 //because returntype is considered at run time 
	}										 //therefore at compile time only parameter is scaned and there is same signatures
	*/
	
	public float sum(float no1, float no2) {
		return (no1+no2);
	}
	
	public double sum(double no1, double no2) {
		return (no1+no2);
	}
	
	public static void main(String args[]) {
		MethodOverloading obj = new MethodOverloading();
		System.out.println("sum of integer with 2 pargument : "+obj.sum(20, 10));
		System.out.println("sum of integer with 3 pargument : "+obj.sum(20, 10,30));
		System.out.println("sum of float with 2 pargument : "+obj.sum(20.5f, 10.5f));//f because bydefault consider as double
		System.out.println("sum of double with 2 pargument : "+obj.sum(20.5, 10.5));
	}
}
