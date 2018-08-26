package com.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.junit.jupiter.api.Test;

import com.entity.User;

class HibTest {

	@Test
	void test() {
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		session.beginTransaction();
		User user = new User();
		user.setUsername("demo");
		user.setPassword("143");
		session.save(user);
		session.getTransaction().commit();
		session.close();
	}

}
