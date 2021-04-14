package ex2;

public class Array6 {
	
	public static void main(String[] args) {
		int arr[] = {10,20,30,40,50};
		
			for(int i = 0; i< arr.length; i++) {
				
				int r = i * 2 * arr[i];
				System.out.println(r);
				System.out.println(i);
			}
	}

}