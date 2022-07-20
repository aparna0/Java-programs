package com.multithreading;

class NewThread implements Runnable {
	String name;
	public NewThread(String name) {
			Thread t = new Thread(this,name);
			this.name = name;
			t.start();
	}
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println(name+" : "+i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}
public class CreatingMultipleThreads{
	public static void main(String args[]) {
		System.out.println("start");
		NewThread nt1= new NewThread("NewThread1");
		NewThread nt2= new NewThread("NewThread2");
		NewThread nt3= new NewThread("NewThread3");
		NewThread nt4= new NewThread("NewThread4");
		System.out.println("end");
		
	}
}
