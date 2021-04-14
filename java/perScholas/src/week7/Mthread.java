package week7;

public class Mthread extends Thread {

	static Mthread thread1 = new Mthread();
	static Mthread thread2 = new Mthread();
	static Mthread thread3 = new Mthread();
	
	public void run() {
		System.out.println(Thread.currentThread().getName() );
       for(int i = 1; i <= 5; i++) {
    	   try {
			sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	   System.out.println(i);
       }
       
        
    }
	public static void main(String[] args) {
		thread1.run();
		thread2.start();
		thread3.start();

	}

}
