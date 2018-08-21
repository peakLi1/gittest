package com.spring.demo.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.spring.demo.dao.UserDao;

@Service(value="userServiceImpl1")
public class UserServiceImpl1 implements UserService {
	@Resource(name="userDaoImpl2")
	private UserDao userDao;
	
	public UserServiceImpl1() {
		
	}
	
	public UserServiceImpl1(UserDao userDao) {
		this.userDao = userDao;
	}
	
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	@Override
	public void add() {
		userDao.add();
		System.out.println("This is ServiceAdd Method.");

	}

}
