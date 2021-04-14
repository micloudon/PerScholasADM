package ex3;


class Employee {
	long employeeId;
	String employeeName;
	String employeeAddress;
	long employeePhone;
	double basicSalary;
	double specialAllowance = 250.80;
	double hra = 1000.50;
	
	Employee(long id, String name, String address, long phone) {
		this.employeeId = id;
		this.employeeName = name;
		this.employeeAddress = address;
		this.employeePhone = phone;
		
	}
	
	double calculateSalary(){
		double salary = basicSalary + ( basicSalary * specialAllowance/100) + ( basicSalary * hra/100);
		return salary;
	}
	
	double calculateTransportAllowance() {
		double transportAllowance = 0.1 * basicSalary;
		return transportAllowance;
	} 
}

class Manager extends Employee {
	
	Manager(long id, String name, String address, long phone, double salary){
		super(id, name, address, phone);
		this.basicSalary = salary;
	}
	
	double calculateTransportAllowance() {
		double transportAllowance = 0.15 * basicSalary;
		return transportAllowance;
	} 
}

class Trainee extends Employee {

	Trainee(long id, String name, String address, long phone, double salary){
		super(id, name, address, phone);
		this.basicSalary = salary;
	}
	
}

public class TestEmployee {
	public static void main(String[] args) {
		Employee m1 = new Manager(126534, "Peter", "Chennal India", 237844, 65000);
		System.out.println(m1.calculateSalary());
		System.out.println(m1.calculateTransportAllowance());
		
		Employee t1 = new Trainee(232342, "Jack", "Mumbia India", 454554, 45000);
		System.out.println(t1.calculateSalary());
		System.out.println(t1.calculateTransportAllowance());
	}
}
