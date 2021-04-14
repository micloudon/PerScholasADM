package com.employee;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employees")
public class EmployeeEntity {
	
	@Id
	 private Integer employeeNumber;
	 private String firstName;
	 private String lastName;
	 private String email;
	 private Integer officeCode;
	 private String jobTitle;

	 private String extension;
	 
	 public EmployeeEntity() {
		 super();
	 }
	 
	 public EmployeeEntity(Integer employeeNumber, String firstName, String lastName, String email, Integer officeCode, String jobTitle, String extension)
	 {   super();
	     this.employeeNumber = employeeNumber;  
	     this.firstName = firstName;  
	     this.lastName = lastName;
	     this.email = email;
	     this.officeCode = officeCode;
	     this.jobTitle = jobTitle;
	     this.extension = extension;
	 }
	 
	public Integer getEmployeeNumber() {
		return employeeNumber;
	}
	public void setEmployeeNumber(Integer employeeNumber) {
		this.employeeNumber = employeeNumber;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Integer getOfficeCode() {
		return officeCode;
	}
	public void setOfficeCode(Integer officeCode) {
		this.officeCode = officeCode;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}


	public String getExtension() {
		return extension;
	}

	public void setExtension(String extension) {
		this.extension = extension;
	}


}