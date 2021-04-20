package jpa.entitymodels;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="Student")
public class Student {
	
	@Id
	@Column(name="email")
	private String sEmail;
	
	@Column(name="name")
	private String sName;
	
	@Column(name="password")
	private String sPass;
	
//	Creates join table named Student_Course
	@OneToMany(targetEntity = Course.class)
	private List<Course> sCourses;
	
	public Student() {
		super();
//		sEmail = "email";
//		sName = "name";
//		sPass = "password";
//		sCourses.add(0, null);
//		
	}
	
	public Student(String sEmail, String sName, String sPass, List<Course> sCourses) {
		super();
		this.sEmail = sEmail;
		this.sName = sName;
		this.sPass = sPass;
		this.sCourses = sCourses;
	}
	
	
	
	public String getsEmail() {
		return sEmail;
	}
	public void setsEmail(String sEmail) {
		this.sEmail = sEmail;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public String getsPass() {
		return sPass;
	}
	public void setsPass(String sPass) {
		this.sPass = sPass;
	}
	public List<Course> getSCourses() {
		return sCourses;
	}
	public void setSCourses(List<Course> sCourses) {
		this.sCourses = sCourses;
	}

}
