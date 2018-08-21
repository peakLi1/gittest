package com.spring.demo.dao;

import org.springframework.stereotype.Repository;

@Repository(value="userDaoImpl1")
public class UserDaoImpl1 implements UserDao {
	public void add() {
		System.out.println("This is DaoAdd Method1.");
	}

}
