package jpa.service;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import jpa.dao.StudentDAO;
import jpa.entitymodels.Course;
import jpa.entitymodels.Student;

public class StudentService implements StudentDAO {
	
	static EntityManagerFactory emfactory = null;
	static EntityManager entitymanager = null;
	
	private void openConnection() {
		emfactory = Persistence.createEntityManagerFactory( "SMS" );
		entitymanager = emfactory.createEntityManager();
	}
	
	private void closeConnection() {
		entitymanager.close();
	      emfactory.close();
	}

	@Override
	public List<Student> getAllStudents() {
		
		openConnection();
		
//		TypedQuery is need to get students as list object
		TypedQuery<Student> query = entitymanager.createQuery("Select s from Student s", Student.class);
		
		List<Student> results = query.getResultList();
		
		closeConnection();
		
		return results;
	}

	@Override
	public Student getStudentByEmail(String sEmail) {
		
		openConnection();
		
		Student student = entitymanager.find(Student.class, sEmail);
		closeConnection();
		
		return student;
	}

	@Override
	public Boolean validateStudent(String sEmail, String sPass) {
		
		openConnection();
		
		Query query = entitymanager.createQuery("SELECT s.sEmail, s.sName, s.sPass FROM Student s where s.sEmail like " 
				+"'"+sEmail+"'"+" AND"+" s.sPass like "+"'"+sPass+"'");
				List<Course> results = query.getResultList();
				if(results.isEmpty()) {
					closeConnection();
					return false;
					
				}
				else {
					closeConnection();
					return true;
				}
	}

	@Override
	public void registerStudentToCourse(String sEmail, int cId) {
		
//		it doesn't like when we use the open and close methods, so I opened the connection manually
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("SMS");
		EntityManager entitymanager = emfactory.createEntityManager();
		entitymanager.getTransaction().begin();

//		instantate Course and Student objects
		Course addCourse = new Course();
		Student student = new Student();
	
		List<Course> sCourse = new ArrayList<Course>();
		
		student = entitymanager.find(Student.class, sEmail);
	
		sCourse = getStudentCourses(sEmail);
	
		addCourse = entitymanager.find(Course.class, cId);
	
		sCourse.add(addCourse);
	
		Student courseStudent = new Student(student.getsEmail(), student.getsName(), student.getsPass(), sCourse);
		
		entitymanager.merge(courseStudent);
		entitymanager.getTransaction().commit();
	
		entitymanager.close();
		emfactory.close();
		
	}

	@Override
	public List<Course> getStudentCourses(String sEmail) {
		// open connection
				openConnection();
				
				Student findStudent = entitymanager.find(Student.class, sEmail);
				List<Course> studentCourses = findStudent.getSCourses();

				closeConnection();

				return studentCourses;
		
	}


}
