package testing;

import static org.junit.Assert.assertEquals;

import static org.junit.jupiter.api.Assertions.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.junit.jupiter.api.Test;

import entities.UserEntity;
import service.Initalize;

class UnitTest {

	@Test
	void test() {
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "JPAJunit" );
	    EntityManager entitymanager = emfactory.createEntityManager();
		
	    Query query = entitymanager.createQuery("Select u.email from UserEntity u");
	    
		
		assertEquals("soda@gmail.com", query.getResultList());
	}

}
