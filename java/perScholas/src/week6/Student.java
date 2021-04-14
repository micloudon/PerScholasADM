package week6;

public class Student {

	int studentid;
	String firstName;
	String lastName;
	String email;
	String phone;
	
	public Student() {
		super();
	}

	public Student(int studentid, String firstName, String lastName, String email, String phone) {
		this.studentid = studentid;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phone = phone;
	}

	public int getStudentid() {
		return studentid;
	}

	public void setStudentid(int studentid) {
		this.studentid = studentid;
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

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	

	@Override
	public String toString() {
		return "Student [studentid=" + studentid + ", firstName=" + firstName + ", lastName=" + lastName + ", email="
				+ email + ", phone=" + phone + ", getStudentid()=" + getStudentid() + ", getFirstName()="
				+ getFirstName() + ", getLastName()=" + getLastName() + ", getEmail()=" + getEmail() + ", getPhone()="
				+ getPhone() + "]";
	}
	
	public static void main(String[] args) {
		Student Mike = new Student(6879, "mike", "jones", "mic@ggg", "44444");
		
		System.out.println(Mike.toString());
	}

}
