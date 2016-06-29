package com.training.polymorphism;

public class Truck extends vehicle {

	@Override
	public void goFast() {
		System.out.println("Truck: going at 30 miles/hour");
		
	}

	@Override
	public void stop() {
		System.out.println("Truck: Will make a stop every 8 hours");
		
	}

	@Override
	public void reverse() {
		System.out.println("Truck: go reverse for 200 meters  ");
		
	}

	
}
