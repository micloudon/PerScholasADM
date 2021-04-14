package week7;

public class Main3 {
	
	public synchronized void run() {
		 
		for(int i = 0; i<1000000; i++) {
			System.out.println(Thread.currentThread().getId() + ":    " + i);
		}
         
    }
	
	public synchronized void go() {
		 
		for(int i = 0; i<1000000; i++) {
			System.out.println(Thread.currentThread().getId() + ": " + "0");
		}
         
    }
	
	public static void main(String[] args) {
	
	Main3 thread = new Main3();
	thread.run();
	
	Main3 thread2 = new Main3();
	thread2.go();
	
	}
	

}
