package jpa.entitymodels;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="Course")
public class Course {
	
	@Id
	@GeneratedValue( strategy = GenerationType.AUTO )
	@Column(name="id")
	int cid;
	
	@Column(name="name")
	String Cname;
	
	@Column(name="instructor")
	String cInstructorName;
	
	public Course() {
		super();
	}

	public Course(int cid, String cname, String cInstructorName) {
		super();
		this.cid = cid;
		Cname = cname;
		this.cInstructorName = cInstructorName;
	}
	
	
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return Cname;
	}
	public void setCname(String cname) {
		Cname = cname;
	}
	public String getcInstructorName() {
		return cInstructorName;
	}
	public void setcInstructorName(String cInstructorName) {
		this.cInstructorName = cInstructorName;
	}
}
