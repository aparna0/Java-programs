package com.multithreading;

public class ThreadByExtendingThreadClass extends Thread{
	public ThreadByExtendingThreadClass(String name) {
		 
		//Thread t = new Thread();but it is not required because we allready extending Thread class 
		//so we can create thread by calling thread class constructor in sub class
		//but while implementing Runnable ,to create thread we have to create object of thread
		
		//super();
		//super(Runnable target) i.e super(this);
		//super(Runnable target, String name);
		//super(STring name);
		super(name);
		start();
	}
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println("new thread"+i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	public static void main(String args[]) {
		new ThreadByExtendingThreadClass("thread1");
		try {
			for(int i=5;i>=1;i--) {
				System.out.println("main thread"+i);
				
				Thread.sleep(500);
			}
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
