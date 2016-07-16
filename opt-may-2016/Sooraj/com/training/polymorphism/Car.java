package com.training.polymorphism;

public class Car extends Vehicle {
	

	@Override
	public void goFast() {
		System.out.println("This class includes all th classes");
		System.out.println("Car: The car is going faster");
		
	}
//
	@Override
	public void stop() {
		System.out.println("car: The car is stopping");
		
	}

	@Override
	public void reverse() {
		System.out.println("car:The car is going in reverse");
		
	}
	
	
}
	
