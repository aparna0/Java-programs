package com.multithreading;
class ExtendThread extends Thread{
	int count = 0;
	public void run() {
		System.out.println("ExtendThread : "+(++count));
	}
}
 
class ImplementRunnable implements Runnable{
	int count = 0;
	public void run() {
		System.out.println("ImplementRunnable : "+(++count));
	}
}
public class ThreadVrRunnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//for extended sub class
		ExtendThread et1 = new ExtendThread();
		et1.start();
		ExtendThread et2 = new ExtendThread();
		et2.start();
		ExtendThread et3 = new ExtendThread();
		et3.start();
		
		//for runnable
	    ImplementRunnable runnableObject = new ImplementRunnable();
	    Thread t1 = new Thread(runnableObject);
	    t1.start();
	    Thread t2 = new Thread(runnableObject);
	    t2.start();
	    Thread t3 = new Thread(runnableObject);
	    t3.start();
	    
	   // Thread.sleep(1000);
	}

}
