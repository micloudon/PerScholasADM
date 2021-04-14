import java.util.Scanner;
 
public class Time {
	public static void main(String[] args) {
		int minutes;	
		int seconds;		
		
		Scanner scanner = new Scanner(System.in);

    		System.out.println("enter seconds");

		seconds = scanner.nextInt();
		
		minutes = seconds / 60;
		
		seconds %= 60;
		
		System.out.println("minutes " + minutes + "seconds " + seconds);		
	}
}

