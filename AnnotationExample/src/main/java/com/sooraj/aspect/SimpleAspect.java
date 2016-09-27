package com.sooraj.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class SimpleAspect {
	@Before("execution(public void com.sooraj.annotationexample.Toyota.driveMyCar())")
	public void checkMyBrake() {
		System.out.println("Brakes ghave been checked");
	}

	@Before("execution(public void driveMyCar())")
	public void checkMyTyres() {
		System.out.println("Tyres have been checked");
	}

}
