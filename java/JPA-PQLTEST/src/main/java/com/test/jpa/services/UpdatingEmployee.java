package com.test.jpa.services;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.test.jpa.employee.EmployeeEntity;

public class UpdatingEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf = Persistence.createEntityManagerFactory( "JPA-PQLTEST" );  
        EntityManager em = emf.createEntityManager();  
        em.getTransaction().begin( );  
          
         Query query = em.createQuery( "update EmployeeEntity SET email='abcd@gmail.com' where employeeNumber = 1088");  
         query.executeUpdate();  

        em.getTransaction().commit();  
        em.close();  
        emf.close();
	}

}

