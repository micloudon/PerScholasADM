package week7;

public class Main extends Thread {

	

	public void run() {
	
        System.out.println("Hello World!" + Thread.currentThread().getId() );
       
        
    }

	public static void main(String[] args) {
		Main thread = new Main();
		thread.start();
		
		Main thread2 = new Main();
		thread2.start();
		
		Main thread3 = new Main();
		thread3.start();
		
		Main thread4 = new Main();
		thread4.start();
		
		Main thread5 = new Main();
		thread5.start();

	}

}
