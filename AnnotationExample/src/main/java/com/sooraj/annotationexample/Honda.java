package com.sooraj.annotationexample;

import org.springframework.stereotype.Component;

@Component
public class Honda implements Car {
	@Override
	public void driveMyCar(){
		System.out.println("I am driving honda");
		
	}

}
