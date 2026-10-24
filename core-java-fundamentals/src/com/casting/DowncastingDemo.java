package com.casting;

public class DowncastingDemo {
	import java.util.*;
import java.lang.*;
import java.io.*;

class Parest{
    int a = 10;
    int d =40;
    public void print(){
        System.out.println(a);
    }
    public void print2(){
        System.out.println("Parest");
    }
}

class Child extends Parest{
    int a = 20;
    int b = 30;
    public void print(){
        System.out.println(a);
    }
    public void print3(){
        System.out.println("Parest");
    }
}

	public static void main (String[] args) throws java.lang.Exception
	{
        //downcasting
        Parest p = new Child();
        Child c = (Child)p;
        c.print();
        System.out.println(c.a);
        System.out.println(c.b);
        System.out.println(c.d);
        c.print2();
	}

}

// Your Output
// 20
// 20
// 30
// 40
// Parest

// Notes:
// In downcasting, refrence reference is child class which holds another refernce of parent class which holds the object of parent class.
// therefore it can access both class members but his first priorit is reference class i.e child class. 
// if we are callin an member common in both class, it will call child members only.
// if member is not present in child class then it will check in parent class
