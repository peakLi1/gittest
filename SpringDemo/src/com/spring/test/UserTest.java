package com.spring.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.spring.demo.dao.Student;
import com.spring.demo.dao.Student2;

public class UserTest {
	@Test
	public void test() {
		ApplicationContext context = new 
				ClassPathXmlApplicationContext("scopeTestContext.xml");
		Student student = (Student)context.getBean("student1");
		System.out.println(student.toString()+student.hashCode());
		Student student1 = (Student)context.getBean("student1");
		System.out.println(student.toString()+student1.hashCode());
		
	}

}
