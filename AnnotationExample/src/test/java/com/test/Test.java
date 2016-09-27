package com.test;

import static org.junit.Assert.*;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sooraj.users.User;

public class Test {

	@org.junit.Test
	public void test() {
		ApplicationContext conext = new ClassPathXmlApplicationContext("aop_sample.xml");
		User user = conext.getBean("user", User.class);
		user.driving();
	}

}
