package com.casting;

public class ImplicitTypeCast {

	/*implicit type cast is done when,
		1)dothe datatype campatable to each other
		2)destination type size shold be greater than source type size
	*/	
	public static void main(String[] args) {
		int a = 10;
		float b = a;
		System.out.println(a);
		System.out.println(b);
		//int c = "1";   int and string is not compatible to each other
		//int c = b; //size of float is greater that int therefore we can't place float into int

	}

}
