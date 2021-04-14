package week7;

public class Main2 extends Thread {
	
	
	
	public synchronized void run() {
	 
		for(int i = 0; i<1000000; i++) {
			System.out.println(Thread.currentThread().getId() + ":    " + i);
			
		}
       
        
    }
	

	public static void main(String[] args) {
		Main2 thread = new Main2();
		thread.run();
		
		Main2 thread2 = new Main2();
		thread2.run();
	}

}
