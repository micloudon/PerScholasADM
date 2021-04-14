package com.service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.employee.EmployeeEntity;

public class UpdatingEmployee {

	public static void main(String[] args) {
		
		      EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "TestMyql" );
		      EntityManager entitymanager = emfactory.createEntityManager();
		      entitymanager.getTransaction( ).begin( );
		      EmployeeEntity employee = entitymanager.find(EmployeeEntity.class,1056);
		      
		      System.out.println("Before Updation");  
		      System.out.println("employee ID = " + employee.getEmployeeNumber());
		      System.out.println("employee FIRST NAME = " + employee.getFirstName());
		      System.out.println("employee LAST NAME = " + employee.getLastName());
		      System.out.println("employee EMAIL = " + employee.getEmail());
		      System.out.println("employee OfficeCode = " + employee.getOfficeCode());
		      
		      System.out.println("After Updation");  
		      employee.setEmail("xyz01@prscholas.org");
		      entitymanager.getTransaction().commit( );
		      
		      System.out.println("employee EMAIL = " + employee.getEmail());
		      entitymanager.close();
		      emfactory.close( );   



	}

}
