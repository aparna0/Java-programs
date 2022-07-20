package com.multithreading;

public class IsAliveAndJoinDemo implements Runnable {
	String name;
	Thread t;
	public IsAliveAndJoinDemo(String name) {
		this.name = name;
		t = new Thread(this,name);
		t.start();
	}
	public void run() {
		System.out.println(name + " is alive ?"+ t.isAlive());
		for(int i=1;i<=3;i++) {
			System.out.println(name+" "+i);
			System.out.println(name + " is going to sleep for 500ml");
			try {
				Thread.sleep(500);
			}
			catch(InterruptedException e) {}
		}
	}
	public static void main(String args[]) {
		Thread mt = Thread.currentThread();
		System.out.println(" is main thread alive ? "+mt.isAlive());
		
		IsAliveAndJoinDemo obj1 = new IsAliveAndJoinDemo("first thread");
		IsAliveAndJoinDemo obj2 = new IsAliveAndJoinDemo("second thread");
		System.out.println("is new 2 thread are alive before join "+obj1.t.isAlive()+"\t"+obj2.t.isAlive());
		
		System.out.println("join on first thread get called");
		try {
			obj1.t.join();
		}catch(InterruptedException e) {}
		System.out.println("is 1st thread is live ? "+obj1.t.isAlive());
		System.out.println("is 2st thread is live ? "+obj2.t.isAlive());
		
		System.out.println("join on first thread get called");
		try {
			obj1.t.join();
		}catch(InterruptedException e) {}
		System.out.println("is 1st thread is live ? "+obj1.t.isAlive());
		System.out.println("is 2st thread is live ? "+obj2.t.isAlive());
		
	}
}
