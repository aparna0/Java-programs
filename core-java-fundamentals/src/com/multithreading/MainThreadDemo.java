package com.multithreading;

//Main Thread is thread from which other child thread spawn
//It starts first and ends last
//It has a priority 5

//Priority :
//It is integer value, associated with each thread which speifies the order of execution.
//If two thread have same priority then flow of execution is depend on scheuler.
//3 Constants defined in the Thread class:
//        public static int MIN_PRIORITY = 1
//        public static int NORM_PRIORITY = 5
//        public static int MAX_PRIORITY = 10

public class MainThreadDemo {

	public static void main(String[] args) {
		Thread t = Thread.currentThread(); // it returns reference of main thread & this method public static
		System.out.println(t);  //Thread[main,5,main] in o/p list 1st is name, 2nd is priority and 3rd is parent thread 
			
		System.out.println(t.getName());   // main
		t.setName("newThread");
		System.out.println(t);  //Thread[newThread,5,main]
			
		t.setPriority(2);
		System.out.println(t.getPriority());  //2
			
		System.out.println(t.getState());
			
		for(int i=1; i<=5; i++) {
			System.out.println(i);
			try {
				//t.sleep(500);
				Thread.sleep(500);
			} 
			catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		Thread t = Thread.currentThread();
	        System.out.println(t.getName());
	        System.out.println(t.getPriority());
	        System.out.println(t.getState());
	        System.out.println(t.getThreadGroup());
	        System.out.println(t.isAlive());
	        t.setName("Main Thread");
	        System.out.println(t.getName());

		System.out.println(Thread.currentThread().getPriority());
        	Thread.currentThread().setPriority(1);
	        System.out.println(Thread.currentThread().getPriority());
	        Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
	        System.out.println(Thread.currentThread().getPriority());
  
	}

}
