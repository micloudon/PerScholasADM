package com.service;

import com.employee.EmployeeEntity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;



public class FindingEmployee {

	public static void main(String[] args) {
		  EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("TestMyql");
	      EntityManager entitymanager = emfactory.createEntityManager();
	      EmployeeEntity employee = entitymanager.find(EmployeeEntity.class,1056);

	      System.out.println("employee ID = " + employee.getEmployeeNumber());
	      System.out.println("employee FIRST NAME = " + employee.getFirstName());
	      System.out.println("employee LAST NAME = " + employee.getLastName());
	      System.out.println("employee EMAIL = " + employee.getEmail());
	      System.out.println("employee OfficeCode = " + employee.getOfficeCode());


	}

}
