package com.multithreading;
import java.util.*;
class increamentVal{
	
}
class Increamenter extends Thread{ 
	UnsyncronizedProblem target;
	public Increamenter(UnsyncronizedProblem t) {
		super();
		start();
		target = t;
	}
	public void run() {
		target.increament();
	}
}
public class UnsyncronizedProblem {
	int value;

	public UnsyncronizedProblem(int value) {
		this.value = value;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	void increament( ) {
		int incVal;
		incVal = this.getValue() + 10;
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.setValue(incVal);
	}
	public static void main(String args[]) {
		UnsyncronizedProblem obj = new UnsyncronizedProblem(10);
		System.out.println("value before update : "+obj.getValue());
		Increamenter incr = new Increamenter(obj);
		System.out.println("value after update : "+obj.getValue());
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("value after update : "+obj.getValue());
	}
	
}
