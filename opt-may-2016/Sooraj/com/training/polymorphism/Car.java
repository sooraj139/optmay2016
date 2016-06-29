package com.training.polymorphism;

public class Car extends vehicle {

	@Override
	public void goFast() {
		System.out.println("Car: The car is going fast");
		
	}

	@Override
	public void stop() {
		System.out.println("car: The car is stopping");
		
	}

	@Override
	public void reverse() {
		System.out.println("car:The car is going in reverse");
		
	}
	
	
}
	
