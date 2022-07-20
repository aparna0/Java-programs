package com.casting;

public class ExplicitTypecasting {
	
	//we can perform explicit type cast by explicitly writting type in brackets
	public static void main(String[] args) {
		
		//int a = (int) "1"; not applicable
		String s = "1";
		//int a = (int) s;  not applicable
		
		//String s = (String) 1;  not applicable
		
		float f1 = 10;
		float f2 = 10.5f;
		
		//int a = f1; implicit type casting not applicable
		int a = (int)f1;
		int b = (int)f2; 

		System.out.println(a);
		System.out.println(b);
	}

}
