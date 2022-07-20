package com;

import java.util.Scanner;

public class AssertionDemo {
	public static int calAge(int BYear) {
		int currentYear = 2020;
		int age = currentYear - BYear;
		assert age != 0:printMsg();  //return type should not be a void
		assert age > 0: "invalid birthday year";
		return age;
	}
	public static int getAge(int Byear) {
		int age;
		assert Byear > 0 ;
		age = calAge(Byear); 
		return age;
	}
	public static String printMsg() {
		return ("persorn age is not predicated by only using birth year becuase age is less by 1 year");
	}
	
	public static void main(String[] args) {
		System.out.println("Enter your birthday year\t");
		Scanner sc = new Scanner(System.in);
		int Byear = sc.nextInt();
		System.out.println(AssertionDemo.getAge(Byear));
	}

}
