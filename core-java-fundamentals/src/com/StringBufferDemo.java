package com;

public class StringBufferDemo {
	public static void main(String args[]) {
		//StringBuffer is mutable and thread safe
        
        StringBuffer sb1 = new StringBuffer();
        System.out.println("Default capacity is "+sb1.capacity());      //16

        //extending capacity, we add more char then it will increase capacity by
        //capacity = (current capacity + 1) * 2
        sb1.append("11111222223333344444");
        System.out.println("capacity is "+sb1.capacity());              //34 <= (16+1)*2

        StringBuffer sb2 = new StringBuffer("abc");
        //if you create StringBuffer with given String then
        //capacity = default capacity + length if passed string
        System.out.println("capacity is "+sb2.capacity());              //19 <= 16+3

        sb2.append("12345678912345678910");
        System.out.println("capacity is "+sb2.capacity());              //40 <= (current+1)*2

        StringBuffer sb3 = new StringBuffer("123456789123456789");       //34 <= 16+18
        System.out.println("capacity is "+sb3.capacity());

        //Important methods of StringBuffer
        //capacity()
        //length()
        //append(x)  // x = int, float, double, long, char, string, char[], StringBuilder
        //charAt()
        //setCharAt()
        //indexOf(str) / indexOf(string str, int fromIndex)
        //insert(off, any datatype value)
        //delete(fromIndex, number of char)
        //deleteCharAt(index)
        //setLength(int length)
        //ensureCapacity(int minCapacity)
        //trimToSize()

        System.out.println(sb3.length());           //18

        System.out.println(sb3.append(123));
        System.out.println(sb3.append(123.5f));
        System.out.println(sb3.append(123.56));
        char[] ch = {'z','v','k'};
        System.out.println(sb3.append(ch,1, 2));    //123456789123456789123123.5123.56vk

        sb3.setCharAt(1,'x');                       //x

        System.out.println(sb3.charAt(1));                      //2
        System.out.println(sb3);                                //1x3456789123456789123123.5123.56vk

        System.out.println(sb3.indexOf("1"));                   //0
        System.out.println(sb3.indexOf("1", 9));    //9

        System.out.println(sb1.insert(1,"aparna"));
        System.out.println(sb1.delete(0,sb1.length()));       //delete whole valur of StringBuffer
        //System.out.println(sb1.insert(1,"aparna"));           //StringIndexOutOfBoundsException

        sb1.append(12345);

        sb1.delete(0,2);
        System.out.println(sb1);        //345

        sb1.deleteCharAt(0);
        System.out.println(sb1);        //45

        StringBuffer sb4 = new StringBuffer("123456789");
        sb4.setLength(5);
        System.out.println(sb4);        //12345
        sb4.append(9876);
        System.out.println(sb4);        //123459876

        StringBuffer sb5 = new StringBuffer();  //default 16
        sb5.ensureCapacity(3);
        System.out.println(sb5.capacity());     //16 <- current capacity, because ensure capacity is less that
        sb5.ensureCapacity(17);
        System.out.println(sb5.capacity());     //34 <- (16+1)*2 <- (current Capacity + 1) * 2 , because current capacity is less that ensure capacity
        sb5.append("1111111111222222222233333333334444444444");
        System.out.println(sb5.capacity());     //70 <- (current Capacity + 1) * 2

        StringBuffer sb6 = new StringBuffer(20);
        sb6.append(123);
        sb6.trimToSize();
        System.out.println(sb6.capacity());     //3
	} 
}
