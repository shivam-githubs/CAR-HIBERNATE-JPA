package com.jsp.car;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


public class CarUpdate {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("shivam");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();		
		Car car= entityManager.find(Car.class, 2);
		car.setModel("x1");
		entityTransaction.begin();
		entityManager.merge(car);
		entityTransaction.commit();
		
	}
}
