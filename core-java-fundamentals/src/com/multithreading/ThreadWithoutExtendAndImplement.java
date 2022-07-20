package com.multithreading;
public class ThreadWithoutExtendAndImplement {
	public static void main(String args[]) {
		System.out.println("creating thread without extending Thread class or implementing Runnable interface i.e by simply creating object of Thread class");
		Thread t1 = new Thread();
		System.out.println(t1);
	    Thread t2 = new Thread();
		System.out.println(t2);
		t2.start();
		Thread t3 = new Thread();
		System.out.println(t3);
		t3.start();
		
		System.out.println("ok");
	}
}
