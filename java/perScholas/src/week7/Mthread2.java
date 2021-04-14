package week7;

public class Mthread2 extends Thread  {

	static Mthread2 thread1 = new Mthread2();
	static Mthread2 thread2 = new Mthread2();
	static Mthread2 thread3 = new Mthread2();
	
	public void run() {
		System.out.println(Thread.currentThread().getName() );
		System.out.println(Thread.currentThread().getPriority() );
		System.out.println("==================================" );
    	   try {
			sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
       }
       
 
	public static void main(String[] args) {
		thread1.setPriority(1);
        thread2.setPriority(5);
        thread3.setPriority(10);
		thread1.start();
		thread2.start();
		thread3.start();

	}

}
