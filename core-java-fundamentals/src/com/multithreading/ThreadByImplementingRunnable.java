package com.multithreading;

public class ThreadByImplementingRunnable implements Runnable {
	String name;
	public ThreadByImplementingRunnable(String name) {
		//Thread t = new Thread();     // not applicable ,it newer call run() method so must pass object
		//Thread t = new Thread(this);
		//Thread t = new Thread(name); // not applicable ,it newer call run() method so must pass object
		this.name = name;
		Thread t = new Thread(this,name);
		//start() //this type of calling is not allowed beacuse is member of Thread call , we need to it by Thread object
		t.start();
	}
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println(name+i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	public static void main(String args[]) {
		ThreadByImplementingRunnable Tobj1 = new ThreadByImplementingRunnable("1st thread");
		ThreadByImplementingRunnable Tobj2 = new ThreadByImplementingRunnable("2st thread");
		try {
			System.out.println("main Thread suspended");
			Thread.sleep(1000);
			System.out.println("main Thread resumed");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	} 
}
