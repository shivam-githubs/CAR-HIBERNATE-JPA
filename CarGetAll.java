package com.jsp.car;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;


public class CarGetAll {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("shivam");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
				String sql = "SELECT e FROM Car e";
		Query query= entityManager.createQuery(sql);
		List <Car> cars = query.getResultList();
		for(Car car : cars)
		{
			System.out.println("===================");
			System.out.println(car.getId());
			System.out.println(car.getBrand());
			System.out.println(car.getModel());
			System.out.println(car.getPrice());
		}
	}
}
