package com.spring.demo.dao;

public class UserImpl1 implements UserFactory {

	public void add() {
		System.out.println("User Add Method.");
	}
	public String toString() {
		return "This is a user object.";
	}

}
