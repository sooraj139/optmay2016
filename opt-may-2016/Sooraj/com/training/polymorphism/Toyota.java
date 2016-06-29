package com.training.polymorphism;

public class Toyota extends Car {
	
	@Override
	public void goFast() {
		System.out.println("Toyota: going at 42 miles /hour");
		
	}

	@Override
	public void stop() {
		System.out.println("Toyota: we will stop in 5 minutes");
		
	}

	@Override
	public void reverse() {
		System.out.println("Toyota:The car is in reverse gear");
		
	}
}
