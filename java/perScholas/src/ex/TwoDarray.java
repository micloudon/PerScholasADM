package ex;

public class TwoDarray {
	
	public static void main(String[] args) {
		int[][] arr = new int[4][5];
		int counter = 0;

		for(int row = 0; row < arr.length; row++) {
		for(int col = 0; col < arr[row].length; col++) {
		arr[row][col] = counter;
		counter += 10;
		}
		}

		for(int row = 0; row < arr.length; row++) {
		for(int col = 0; col < arr[row].length; col++) {
		System.out.print(arr[row][col] + "\t");
		}
		System.out.println();
		}

		System.out.println();
		System.out.println("*******************");
		System.out.println();

		for(int row = 0; row < arr.length; row++) {
		for(int col = 0; col < arr[row].length; col++) {
		arr[row][col] = (int) Math.floor(Math.random() * 100);
		}
		}

		for(int row = 0; row < arr.length; row++) {
		for(int col = 0; col < arr[row].length; col++) {
		System.out.print(arr[row][col] + "\t");
		}
		System.out.println();
		}
		}
}
