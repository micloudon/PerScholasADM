package ex;

import java.util.Arrays;

public class Binarysearch {
		
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6};
		
		int num = 2;
		
		int mid = arr.length / 2;
		
		for(int i: arr) {
			if(num == mid) {
				System.out.println("You found" + num);
			}
			
			else if(num > mid) {
				int[] arr2 = Arrays.copyOfRange(arr, mid, arr.length - 1);

			}
			
			else if(num < mid) {
				int[] arr3 = Arrays.copyOfRange(arr, 0, mid);
			}
		}
		
		
	}
}
