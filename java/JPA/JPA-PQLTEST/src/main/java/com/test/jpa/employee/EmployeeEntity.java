package com.test.jpa.employee;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
 @Table(name="employees")
public class EmployeeEntity {
  @Id 
 int employeeNumber;
 String firstName;
 String lastName;
 String email;
 int officeCode;
 
 public EmployeeEntity(int employeeNumber, String firstName, String lastName, String email, int officeCode)
 {
	  super();
     this.employeeNumber = employeeNumber;  
     this.firstName = firstName;  
     this.lastName = lastName;
     this.email = email;
     this.officeCode =officeCode;
 }
 
 public EmployeeEntity() {  
     super();  
 }  
 public int getOfficecode() {
	return officeCode;
}
public void setOfficecode(int officecode) {
	this.officeCode = officecode;
}
 
 public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}

public int getEmployeeName() {
	return employeeNumber;
}
public void setEmployeeName(int i) {
	this.employeeNumber = i;
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
}

