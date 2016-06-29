package com.training.polymorphism;

public class CarTest {

	public static void main(String[] args) {
		System.out.println("Dealer of Toyota");
		ToyotaDealer obj =new ToyotaDealer();
		obj.implement(new Toyota());
		System.out.println("------------------------");
		System.out.println("Starting the car wash");
		System.out.println("Toyota enters"); 
		CarWash wash=new CarWash();
		wash.wash1(new Toyota());
		System.out.println("Toyota done");
		System.out.println("Honda enters");
		wash.wash2(new Honda());
		System.out.println("Honda done");
		System.out.println("Suzuki enters");
		wash.wash3(new Suzuki());
		System.out.println("Suzuki done");
		System.out.println("Ending the car wash");
		System.out.println("-------------------------");
		System.out.println("Entering DMV");
		DMV d=new DMV();
		d.Truck1(new Truck());
		System.out.println("Exiting DMV");
		
		

	}

}
