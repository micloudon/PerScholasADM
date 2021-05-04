package com.service;



import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


import com.update.ItemEntity;
import com.update.OrderEntity;
import com.update.OrderItemMapping;

public class Initalize {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPASQLTEST");
	    EntityManager manager = factory.createEntityManager();
	    manager.getTransaction().begin();
	    
	    ItemEntity item = new ItemEntity("soda", 1.99);
	    OrderEntity order = new OrderEntity("12/12/21", 20.61, 0.1);
	    

	    manager.persist(item);
	    manager.persist(order);
	    
	    manager.flush();
	    
	    OrderItemMapping oim = new OrderItemMapping(order.getId(), item.getId());
	    manager.persist(oim);
	    manager.getTransaction().commit();
	    manager.close();
	    factory.close();
	    
	    

	}

}
