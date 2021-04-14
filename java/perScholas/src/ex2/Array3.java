package ex2;

import java.util.Arrays;

public class Array3 {
	public static void main(String[] args) {
		String[] arr = {"red", "green", "blue", "yellow"};
		
		String[] arr2 = arr.clone();
		
		System.out.println(Arrays.toString(arr2));
	}

}
