package com;

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
	}

}
