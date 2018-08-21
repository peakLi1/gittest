package com.spring.demo.dao;

import org.springframework.stereotype.Repository;

@Repository(value="userDaoImpl2")
public class UserDaoImpl2 implements UserDao {

	@Override
	public void add() {
		System.out.println("This is Dao Add Method2");

	}

}
