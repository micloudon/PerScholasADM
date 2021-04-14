package ex2;

import java.util.Arrays;

public class Array8 {
	
	public static void main(String[] args) {
		String arr[] = {"A","B","C","D","E"};
			
			int start = 0;
			int mid = 2;
		
			
			String k = arr[start];
			arr[start] = arr[mid];
			arr[mid] = k;
			
			System.out.println(Arrays.toString(arr));
	}

}