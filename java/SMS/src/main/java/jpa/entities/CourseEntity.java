package jpa.entities;

import java.lang.String;
import javax.persistence.*;


@Entity()
@Table(name="Course")
public class CourseEntity {

	@Id
	@GeneratedValue( strategy = GenerationType.AUTO )
	@Column(name="id")
	private int id;
	@Column(name="name")
	private String name;
	@Column(name="instructor")
	private String instructor;
//	private static final long serialVersionUID = 1L;

	public CourseEntity() {
		super();
	}   
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}   
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}   
	public String getInstructor() {
		return this.instructor;
	}

	public void setInstructor(String instructor) {
		this.instructor = instructor;
	}
   
}

