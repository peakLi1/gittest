package com.spring.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.demo.service.UserServiceImpl1;

public class DITest {

	@Test
	public void test() {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"scopeTestContext.xml");
		UserServiceImpl1 userService = (UserServiceImpl1)
				context.getBean("userServiceImpl1");
		userService.add();
		
		
	}

}
