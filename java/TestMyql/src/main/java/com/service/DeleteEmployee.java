package com.service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.employee.EmployeeEntity;

public class DeleteEmployee {

	public static void main(String[] args) {
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "TestMyql" );
		EntityManager entitymanager = emfactory.createEntityManager( );
		entitymanager.getTransaction( ).begin( );
		
//		Deletes by employee number  
		EmployeeEntity employee = entitymanager.find(EmployeeEntity.class, 23);
		entitymanager.remove(employee);
		entitymanager.getTransaction( ).commit( );

		entitymanager.close( );
		emfactory.close( );

	}

}
