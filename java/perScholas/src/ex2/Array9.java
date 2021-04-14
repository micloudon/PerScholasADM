package ex2;

import java.util.Arrays;

public class Array9 {
	public static void main(String[] args) {
		int arr[] = {4, 2, 9, 13, 1, 0};
		
		Arrays.sort(arr);
		
		System.out.println(Arrays.toString(arr));
		System.out.println(arr[0]);
		System.out.println(arr[arr.length -1]);
	}
}
