package com.spring.test;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.demo.dao.PropertyDemo;

public class PropertiesTest {

	@Test
	public void test() {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		PropertyDemo pro = (PropertyDemo)context.getBean("propertyDemo");
		System.out.println(Arrays.toString(pro.getArrs()));
		System.out.println(pro.getList());
		System.out.println(pro.getMap());
		System.out.println(pro.getProperties());
		
	}

}
