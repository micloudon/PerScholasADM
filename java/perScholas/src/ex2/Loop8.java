package ex2;

public class Loop8 {
	
	public static void main(String[] args) {
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.println("Inner loop: i: " + i + ", j: " + j);
			}
		}
	}
}
