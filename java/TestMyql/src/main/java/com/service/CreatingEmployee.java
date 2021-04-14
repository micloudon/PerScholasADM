package com.service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.employee.EmployeeEntity;

public class CreatingEmployee {

	public static void main(String[] args) {

		     EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("TestMyql");  
		     EntityManager em = emfactory.createEntityManager();  
		     em.getTransaction().begin();  


		     EmployeeEntity employee = new EmployeeEntity(); 
		     employee.setEmployeeNumber(25);
		     employee.setEmail( "koddd@gmai.com");
		     employee.setFirstName( "Kyle" );
		     employee.setLastName("g");
		     employee.setOfficeCode(1);
		     employee.setJobTitle("HR");
		     employee.setExtension("E4t45");

		     em.persist(employee);
		     em.getTransaction().commit();
		     em.close();
		     emfactory.close( );   


	}

}
