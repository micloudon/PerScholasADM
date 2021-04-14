package perScholas;
import java.util.Scanner;

public class Bmi {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter height (in meters) and weight (in kilograms)");
		
		double meters = scanner.nextDouble(); 
		int kg = scanner.nextInt(); 
		
		scanner.close();
		
//		System.out.println(meters);
//		System.out.println(kg);
		
		double bmi = kg / (meters * meters);
		
		if(bmi < 18.5) {
			System.out.println("underweight");
		}
		
		else if(bmi <= 18.5 || bmi < 25) {
			System.out.println("underweight");
		}
		
		else if(bmi <= 18.5 || bmi < 25) {
			System.out.println("Healthy");
		}
		
		else if(bmi <= 25 || bmi < 35) {
			System.out.println("Fluffy");
		}
		
		else {
			System.out.println("Welcome to TLC");
		}
		
	}

}
