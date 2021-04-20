package jpa.dao;

import java.util.List;


import jpa.entitymodels.Course;
import jpa.entitymodels.Student;

public interface StudentDAO  {
	
	

	
	public List<Student> getAllStudents();
	      
	public Student getStudentByEmail(String sEmail);
		
	public Boolean validateStudent(String sEmail, String sPass);

	public void registerStudentToCourse(String sEmail, int cId);

	public List<Course> getStudentCourses(String sEmail);

}
