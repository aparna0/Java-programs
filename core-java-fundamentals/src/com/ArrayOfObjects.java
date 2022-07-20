package com;

public class ArrayOfObjects {
	static int no;
	static {
		no = 0;
	}
	public ArrayOfObjects(){
		System.out.println("object "+(++no));
	}
	
	public static void main(String args[]) {
		
		//ArrayOfObjects[] obj= new ArrayOfObjects[5];
		ArrayOfObjects obj[];
		obj = new ArrayOfObjects[5];
		
		for(int i = 0; i<5; i++)
			obj[i] = new ArrayOfObjects();
	}
}
