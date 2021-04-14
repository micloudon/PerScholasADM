package perScholas;
import java.util.Random; 
import java.util.Scanner;


public class Lottery {
	public static void main(String[] args) {
		// create instance of Random class 
        Random rand = new Random(); 
  
        // Generate random integers in range 0 to 99
        int winNum = rand.nextInt(100);
        System.out.println(winNum);
        
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.println("Enter your lotto numbers");
        int inNums = scanner.nextInt();
        
        scanner.close();
        
//        System.out.println(winNum % 10);
//        System.out.println(winNum / 10);
        
        if(inNums == winNum) {
        	System.out.println("You win $5000");
        }
        
        else if(inNums % 10 == winNum / 10 && inNums / 10 == winNum % 10) {
        	System.out.println("You win $1000");
        }
        
        else if(inNums % 10 == winNum / 10 || inNums / 10 == winNum % 10) {
        	System.out.println("You win $250");
        }
        
        else {
        	System.out.println("You win nothing");
        }
        
	}

}
