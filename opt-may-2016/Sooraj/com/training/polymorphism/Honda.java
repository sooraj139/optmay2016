package com.training.polymorphism;

public class Honda extends Car {
	@Override
	public void goFast() {
		System.out.println("Honda: going at 35 miles/hour");
		
	}

	@Override
	public void stop() {
		System.out.println("Honda: its' going to stop");
		
	}

	@Override
	public void reverse() {
		System.out.println("Honda:the car is reverse gear");
		
	}

}
