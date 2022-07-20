package com.overloadingDemo;

public class StaticMethodOverloading {
	public static int  add() {
		return (10+20);
	}
	public static int add(int a, int b) {
		return (a+b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(add());
		System.out.println(add(30,40));
	}

}
