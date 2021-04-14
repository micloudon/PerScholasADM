package service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import entities.UserEntity;


public class Initalize {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPAJunit");
	    EntityManager manager = factory.createEntityManager();
	    manager.getTransaction().begin();
	    
	    UserEntity user = new UserEntity("soda@gmail.com", "joe soda", "sodaman109", "500 soda ave", "Florida", 8090);
	    
	    

	    manager.persist(user);
	   
	    
	   
	    
	    
	    manager.getTransaction().commit();
	    manager.close();
	    factory.close();

	}

}
