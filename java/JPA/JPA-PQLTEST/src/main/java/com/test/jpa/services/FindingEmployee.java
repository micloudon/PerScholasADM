package com.test.jpa.services;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.test.jpa.employee.EmployeeEntity;
import com.test.jpa.employee.OrderEntity;

public class FindingEmployee {
	public static void main( String[ ] args ) {
		  
	      EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "JPA-PQLTEST" );
	      EntityManager entitymanager = 
	    		  emfactory.createEntityManager();
	      
	    //------------------------basic function-----------------------
	    		     Query query =entitymanager.createQuery("Select e.firstName from EmployeeEntity e");
	    		     List<String> list = query.getResultList();
	    		      
	    		     for(String e:list) {
	    		         System.out.println("Employee NAME :"+e);
	    		      }
	    		     
	     //------- where  clause example------------------------------- 

	    		Query  sql_two = entitymanager.createQuery("Select o from OrderEntity o where o.productCode like '%S24_1937%'");
	    		 //sql_two.setParameter("givenID", "S24_1937");
	    		List<OrderEntity> list_two = sql_two.getResultList();
	    		for(OrderEntity result :list_two) {
	    	         System.out.println("Order NAME :"+ result.getOrderNumbers());
	    	         System.out.println("Price :"+ result.getPriceEach());
	    	      }
	    		 
	    		
	    //-------------------- between --------------------------
	    		
	    	      Query sql_three = entitymanager.createQuery( "Select o " + "from OrderEntity o " + 
	    		 "where o.orderNumber " + "Between 100 and 2000" );
	    	      List<OrderEntity> list_three = sql_three.getResultList();
	    			for(OrderEntity result :list_three) {
	    		         System.out.println("Order NAME :"+ result.getOrderNumbers());
	    		         System.out.println("Price :"+ result.getPriceEach());
	    		      }
	    		
	     //---------Aggregate function example ----------------------

	    		      Query query1 = entitymanager.createQuery("Select MAX(o.priceEach) from OrderEntity o");
	    		      int result = (int) query1.getSingleResult();  //  Return object
	    		      System.out.println("Maximum Price:" + result);

	    	      entitymanager.close();
	    	      emfactory.close( );
	    	   }
	    }
