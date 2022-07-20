package com.multithreading;

public class SemaphoreExample{
	public static void main(String args[]) {
		System.out.println("okay");
	}
}
/* 
 static Semaphore semaphore = new Semaphore(3);
	
	static class ThreadDemo extends Thread{
		String tName;
		public ThreadDemo(String name) {
			this.tName = name;
		}
		public void run() {
			System.out.println("Available semaphore permits(counter resource) : "+ semaphore.availablePermits());
			System.out.println("Thread "+this.tName+" aquiring counter resources");
			try {
				semaphore.acquire();
				System.out.println("Thread "+this.tName+" got permited");
				for(int i=0; i<5; i++) {
					System.out.println("Available semaphore permits(counter resource) : "+ semaphore.availablePermits());
					Thread.sleep(2000);
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			finally{
				System.out.println("Releasing resource...");
				semaphore.release();
				System.out.println("Available semaphore permits(counter resource) : "+ semaphore.availablePermits());
			}
		}
	}
	
	ThreadDemo thread1 = new ThreadDemo("A");
		thread1.start();
		ThreadDemo thread2 = new ThreadDemo("B");
		thread2.start();
		ThreadDemo thread3 = new ThreadDemo("C");
		thread3.start();
		ThreadDemo thread4 = new ThreadDemo("d");
		thread4.start();
 */
