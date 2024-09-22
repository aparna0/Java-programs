package com;

public class StringBufferDemo {
	public static void main(String args[]) {
		StringBuffer str1 = new StringBuffer();
		StringBuffer str2 = new StringBuffer("aparna");
		StringBuffer str3 = new StringBuffer("aparna");
		StringBuffer str4 = new StringBuffer("abc");
		StringBuffer str5 = new StringBuffer(4);
		System.out.println("Str1 : "+str1);
		System.out.println("Str2 : "+str2);
		System.out.println("Str3 : "+str3);
		System.out.println("Str4 : "+str4);
		System.out.println("str5 : "+str5);
		
		System.out.println("is Str2 and str3 equals ? "+str2.equals(str3)+" because equals compares reference(memory location) not a values");
		System.out.println("hashcode of Str1 : "+str1.hashCode());
		System.out.println("hashcode of Str2 : "+str2.hashCode());
		System.out.println("hashcode of Str3 : "+str3.hashCode());
		System.out.println("hashcode of Str4 : "+str4.hashCode());
		
		System.out.println("default capacity of any StringBUffer is "+str1.capacity());
		System.out.println("capacity of str2 is "+str2.capacity()+" i.e default 16+6(aparna)=22");
		System.out.println("capacity of str4 is "+str4.capacity()+" i.e default 16+3(abc)=19");
		str1.append("abc");
		System.out.println("Str1 : "+str1+" and capacity : "+str1.capacity());
		str1.append(" cgfggfgjfghfhg ");
		System.out.println("Str1 : "+str1+" and capacity : "+str1.capacity());
		str2.append(" chakrapani mangalaram");
		System.out.println("Str1 : "+str2+" and capacity : "+str2.capacity());
		str5.insert(0,"xyz");
		System.out.println("Str5 : "+str5+" and capacity : "+str5.capacity());
		str5.append(" this is demo");
		System.out.println("Str5 : "+str5+" and capacity : "+str5.capacity());

		StringBuffer str1 = new StringBuffer("abc");
	        StringBuffer str2 = new StringBuffer("abc");
	
	        System.out.println("str1: "+str1);
	        System.out.println("str2: "+str2);
	
	        System.out.println("is str1 equals to str2? "+str1.equals(str2));	//false
	        System.out.println("is str1 == str2? "+ (str1==str2));			//fakse
		
		/*
		str3.append(" CM");
		System.out.println("str3 is "+str3+" and capacity is "+str3.capacity());
		System.out.println("capacity of str5 is "+str5.capacity()+" because explicitly specified");
		System.out.println("inserting value 'abc' in str5");
		str5.append("abc ");
		System.out.println("capacity of str5 is "+str5.capacity());
		System.out.println("inserting value(orchid college) in str5");
		str5.insert(0,"orchid college");
		System.out.println("capacity of str5 after insertion is "+str5.capacity()+" because legth of string is 14");
		System.out.println("inserting abc in str5");
		str5.append(" abc");
		System.out.println("str5 : "+str5+" capacity : "+str5.capacity());
		
		str1.insert(0,"chakrapani mangalaram");
		System.out.println(str1);
		str2.append(str1);
		System.out.println("now str 2 :"+str2+" and hashcode : "+str2.hashCode()+" and capacity is "+str2.capacity());
		System.out.println(str3.reverse());
		System.out.println(str3);
		System.out.println("Str1 :"+str1+" capcity : "+str1.capacity());
		str1.append("abcg");
		System.out.println("Str1 :"+str1+" capcity : "+str1.capacity());
		*/
	} 
}
