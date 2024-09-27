package com;
// StringBuilder is same as a StringBuffer but it is not a thread safe( not synchronized)
// All StringBuffer methods are also present in StringBuilder class
public class StringBuilderDemo {

	public static void main(String[] args) {
		StringBuilder str = new StringBuilder();
		System.out.println(str+"\n capacity : "+str.capacity());
		str.append("aparna chakrapani mangalaram");
		System.out.println("str : "+str+" and capacity is "+str.capacity());
		
		StringBuilder str2 = new StringBuilder("abc");
		System.out.println("str2 : "+str2+" and capacity is "+str2.capacity());
		
		StringBuilder str3 = new StringBuilder(3);
		System.out.println("str3 : "+str3+" and capacity is "+str3.capacity());
		
		str3.append("umashree");
		System.out.println("str3 : "+str3+" and capacity is "+str3.capacity());

		StringBuilder str1 = new StringBuilder("abc");
	        StringBuilder str2 = new StringBuilder("abc");
	
	        System.out.println("str1: "+str1);
	        System.out.println("str2: "+str2);
	
	        System.out.println("is str1 equals to str2? "+str1.equals(str2));	//false
	        System.out.println("is str1 == str2? "+ (str1==str2));			//false

	}
// capacity : 16
// str : aparna chakrapani mangalaram and capacity is 34
// str2 : abc and capacity is 19
// str3 :  and capacity is 3
// str3 : umashree and capacity is 8

}
