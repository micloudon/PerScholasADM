package jpa.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.FixMethodOrder;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import jpa.entitymodels.Course;
import jpa.entitymodels.Student;
import jpa.service.CourseService;
import jpa.service.StudentService;

class UnitTest {
	public final StudentService studentService = new StudentService();
	public final CourseService courseService = new CourseService();

	@Test
	void test() {
		
		List<Student> studentList = studentService.getAllStudents();
		assertEquals("aiannitti7@is.gd", studentList.get(0).getsEmail());
	}
	
	@Test
	void test2() {
		Student studentByEmail = studentService.getStudentByEmail("aiannitti7@is.gd");
		assertEquals("Alexandra Iannitti", studentByEmail.getsName());
	}
	
	@Test
	void test3() {
		Boolean valStudent = studentService.validateStudent("aiannitti7@is.gd", "TWP4hf5j");
		assertEquals(true, valStudent);
	}
	
	
	@Test
	void test4() {
		List<Course> courseList = courseService.getAllCourses();
		assertEquals("Anderea Scamaden", courseList.get(0).getcInstructorName());
	}

}








