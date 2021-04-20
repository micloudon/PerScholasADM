package jpa.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import jpa.dao.CourseDAO;
import jpa.entitymodels.Course;

public class CourseService implements CourseDAO {

	@Override
	public List<Course> getAllCourses() {
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "SMS" );
		EntityManager entitymanager = emfactory.createEntityManager();
		
		TypedQuery<Course> query = entitymanager.createQuery("Select c from Course c", Course.class);
		
		List<Course> results = query.getResultList();
		
		entitymanager.close();
	    emfactory.close();
	    
	    return results;
		
	}

}
