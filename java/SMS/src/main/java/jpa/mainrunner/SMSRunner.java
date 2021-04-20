package jpa.mainrunner;



import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import jpa.entitymodels.Course;
import jpa.entitymodels.Student;
import jpa.service.CourseService;
import jpa.service.StudentService;

public class SMSRunner {

	static StudentService studentService = new StudentService();
	static CourseService courseService = new CourseService();
	static int num;
	static int courseNum;
	
	public static void main(String[] args) {
		
//		Initialize program to create tables
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("SMS");
		EntityManager entitymanager = emfactory.createEntityManager();
		entitymanager.getTransaction().begin();
		
		
		entitymanager.close();
	    emfactory.close();
		
		
		
		Scanner scanner = new Scanner(System.in);
//		System.out.println(courseService.getAllCourses().size());
		
		try {
		
			System.out.println("Enter 1 to login as student, enter any other # to quit");
			 
			int loginNum = Integer.parseInt(scanner.nextLine());
			
		    if(loginNum != 1) {
				System.out.println("You are now signed out");
				System.exit(0);
				
			
		   }
		}
		
		catch(Exception e) {
			System.out.println("Error! Entry must be a number");
			System.exit(0);
		}

			System.out.println("Enter your email");
			
			String email = scanner.nextLine(); 
			
			System.out.println("Enter your password");
			
			String password = scanner.nextLine(); 
			
			Student student = studentService.getStudentByEmail(email);
			
			Boolean valid = studentService.validateStudent(email, password);
			
			if(valid == false) {
				System.out.println("Invalid email and password combination");
				System.exit(0);
			}
			
			else {
		
				List<Course> studentCourses = studentService.getStudentCourses(email);
				System.out.println();
				
				for (Course c : studentCourses) {
					System.out.printf("%10s%30s \n", c.getCid(), c.getCname());
	
				}
				
	
			}
			
			try {
			
			System.out.println();
			System.out.println("Press 1 to register to course, Press any other number to logout");
			
			
				num = scanner.nextInt();
				
			
			
			if(num == 1) {
				
				List<Course> allCourses = courseService.getAllCourses();
				for (Course c : allCourses) {
					
					System.out.printf("%10s%30s \n", c.getCid(), c.getCname());
	
				}
			}
			
			else {
				System.out.println("You are logged out");
				System.exit(0);
			}
			
			}
			catch(Exception e) {
				System.out.println("Error! Entry must be a number");
				System.exit(0);
			} 
			
			try {
			
			System.out.println();
			System.out.println("Enter the course number you wish to register too");

				courseNum = scanner.nextInt();
		

				try {
					if(courseService.getAllCourses().size() >= courseNum && courseNum > 0) {
						studentService.registerStudentToCourse(email, courseNum);
					}
					else {
						System.out.println("ERROR! Number does not match course");
						System.exit(0);
					}
				}
				catch (Exception e) {
					System.out.println("ERROR! Student already registered in that course");
				}
			
			}
			
			catch(Exception e) {
				System.out.println("Error! Entry must be a number");
				System.exit(0);
			} 
			
			List<Course> studentCourses = studentService.getStudentCourses(email);
			
//			System.out.println();
//			System.out.println(student.getsName() + " Your registered courses");
//			
//			System.out.printf("%30s%30s \n", student.getsName(), "courses" );
			for (Course c : studentCourses) {
				System.out.printf("%10s%30s \n", c.getCid(), c.getCname());

			}
			
			System.out.println();
			System.out.println("You are now signed out");
			System.exit(0);
			
	
		scanner.close();
		
	}
}
