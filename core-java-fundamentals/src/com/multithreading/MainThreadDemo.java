package com.multithreading;

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
	}

}
