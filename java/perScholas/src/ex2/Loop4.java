package ex2;

public class Loop4 {
	public static void main(String[] args) {
		for(int i = 0; i <= 100; i+=5) {
			
			if(i<25 || i>75) {
				
				System.out.println(i);
				continue;
			}
			
		}
	}
}
