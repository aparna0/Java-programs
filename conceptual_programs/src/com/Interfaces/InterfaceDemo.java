package com.Interfaces;

interface Vehicle{
	//by default methods are public and abstract
	void accelerator();
	
	//in 8 or higher version, interface can have static method 
	static void startVehicle() {
		System.out.println("vehicle started");
	}
	static void breakVehicle() {
		System.out.println("vehicle stoped");
	}
}

interface Car{
	void accelerator();
}

public class InterfaceDemo implements Vehicle, Car{
	//if both interfaces have same method then define that method only once
	//if both interface have same method name with different return type then class can't implement that method 
	public void accelerator() {
		System.out.println("Accelerating....");
	}
	public static void main(String[] args) {
		InterfaceDemo obj = new InterfaceDemo();
		Vehicle.startVehicle();
		obj.accelerator();
		Vehicle.breakVehicle();
	}
}
