package com.test.service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.test.entity.NonTeachingStaff;
import com.test.entity.TeachingStaff;

public class SaveClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "JPA-MAPPING-SINGLE" );
	      EntityManager entitymanager = emfactory.createEntityManager( );
	      entitymanager.getTransaction( ).begin( );

	      //Teaching staff entity 
	      TeachingStaff ts1=new TeachingStaff(1,"Alex","MSc MEd","Maths");
	      TeachingStaff ts2=new TeachingStaff(2, "Peterson", "BSc BEd", "English");
	      
	      //Non-Teaching Staff entity
	      NonTeachingStaff nts1=new NonTeachingStaff(3, "Ramon", "Accounts");
	      NonTeachingStaff nts2=new NonTeachingStaff(4, "Ali", "Office Admin");

	      //storing all entities
	      entitymanager.persist(ts1);
	      entitymanager.persist(ts2);
	      entitymanager.persist(nts1);
	      entitymanager.persist(nts2);
	      entitymanager.getTransaction().commit();
	      
	      entitymanager.close();
	      emfactory.close();
	}
}

