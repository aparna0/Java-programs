package com.semaphore;
import java.util.concurrent.*;

public class SemaphoreExample {
	
	static Semaphore s = new Semaphore(3);
	
	static class ThreadDemo extends Thread{
		String name;
		ThreadDemo(String name){
			this.name = name;
		}
		public void run() {
			System.out.println("Available semaphore permits(counter resource) : "+ s.availablePermits());
			System.out.println("Thread "+this.name+" aquiring counter resources");
			try {
				s.acquire();
				System.out.println("Thread "+this.name+" got permitted");
				for(int i=0; i<5; i++) {
					Thread.sleep(2000);
				}
			} 
			catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			finally {
				System.out.println("Releasing resource...");
				s.release();
				System.out.println("Available semaphore permits(counter resource) : "+ s.availablePermits());
			}
		}
		
	}
	public static void main(String[] args) {
		ThreadDemo thread1 = new ThreadDemo("A");
		thread1.start();
		ThreadDemo thread2 = new ThreadDemo("B");
		thread2.start();
		ThreadDemo thread3 = new ThreadDemo("C");
		thread3.start();
		ThreadDemo thread4 = new ThreadDemo("d");
		thread4.start();
	}

}
