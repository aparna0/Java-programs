package com.multithreading;
class WithRunnableObject implements Runnable{
	Thread t;
	public WithRunnableObject() {
		t = new Thread(this);
		t.start();
	}
	public void run() {
		System.out.println("thread created with Runnable onject is "+t);
	} 
}

class WithoutRunnableObject implements Runnable{
	Thread t;
	public WithoutRunnableObject() {
		t = new Thread();
		t.start();
	}
	public void run() {
		System.out.println("thread created without Runnable onject is "+t);
	} 
}

public class ThreadConstructorExplanation{
	public static void main(String args[]) {
		WithoutRunnableObject wor = new WithoutRunnableObject();
		WithRunnableObject wr = new WithRunnableObject();
	}
}
