package com.sooraj.users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.sooraj.annotationexample.Car;

@Component("user")
public class User {
	@Autowired
	@Qualifier("toyota")
	public Car car;
	@Autowired
	@Qualifier("honda")
	public Car honda;

	public void driving() {
		car.driveMyCar();
		honda.driveMyCar();
	}

}
