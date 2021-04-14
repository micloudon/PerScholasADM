package ex2;

public class Fib {
	
	public static void main(String[] args) {
		fib(8);
	}
	
	public static void fib(int n) {
		
		int num1 = 0;
		int num2 = 1;
	    for(int i = 0; i<n; i++) {
	    	
	    	int r = num1 + num2;
	    	num1 = num2;
	    	num2 = r;
//	    	System.out.println(i);
//	    	System.out.println(num2);
	    	System.out.println(r);
	    	
	    }
	  }
}
