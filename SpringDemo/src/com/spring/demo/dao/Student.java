package com.spring.demo.dao;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component(value="student1")
@Scope(value="prototype")
public class Student {
	private String name;
	public Student() {
		
	}
	public Student(String name) {
		this.name = name;
	}
	public String toString() {
		return "Student name is:"+name;
	}
}
