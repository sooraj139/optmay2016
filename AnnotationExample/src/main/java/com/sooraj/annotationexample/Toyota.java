package com.sooraj.annotationexample;

import org.springframework.stereotype.Component;

@Component("toyota")
public class Toyota implements Car {

	@Override
	public void driveMyCar() {
		System.out.println("I am driving toyota");

	}

}
