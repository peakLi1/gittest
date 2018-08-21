package com.spring.demo.dao;

public class Student2 {
	private String name;
	private int age;
	public Student2() {
		
	}
	public void setName(String name1) {
		this.name = name1;
	}
	public String getName() {
		return name;
	}
	public String toString() {
		return "Student2 name is "+name+"age is"+age;
	}
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
}
