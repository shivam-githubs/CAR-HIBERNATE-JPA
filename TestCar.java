package com.jsp.car;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory entityManagerFactory =Persistence.createEntityManagerFactory("shivam");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		Car car =new Car();
		car.setBrand("Bmw");
		car.setModel("x4");
		car.setPrice(700000);
	
		entityTransaction.begin();
		entityManager.persist(car);
		entityTransaction.commit();
		
	}

}
