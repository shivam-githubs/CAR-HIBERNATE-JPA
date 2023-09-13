package com.jsp.car;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;



public class CatGetId {
	
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("shivam");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		Car car= entityManager.find(Car.class, 2);
		System.out.println(car.getId());
		System.out.println(car.getBrand());
		System.out.println(car.getModel());
		System.out.println(car.getPrice());
	}
	
	
}
