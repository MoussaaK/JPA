package org.konate.tpjpa;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.konate.tpjpa.model.User;
import org.konate.tpjpa.util.Civility;

public class Main {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = 
				Persistence.createEntityManagerFactory("jpa-test");
		
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		Calendar calendar = new GregorianCalendar(1980, 5, 20);
		Date date = calendar.getTime();
		
		User user1 = new User("Kylian", 19, date, Civility.MR);
		User user2 = new User("Paul", 23, date, Civility.MR);
		
		System.out.println("User 1 = " + user1);
		System.out.println("User 2 = " + user2);
		
		entityManager.getTransaction().begin();
		
		entityManager.persist(user1);
		entityManager.persist(user2);
		
		entityManager.getTransaction().commit();
		
		
		System.out.println("User 1 = " + user1);
		System.out.println("User 2 = " + user2);
	}
}








