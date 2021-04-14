package week7;


class AccountTesting extends Bank{
	Bank account = new Bank();
	
	static account thread1 = new AccountTesting();
	static AccountTesting thread2 = new AccountTesting();
	
	public void run() {
  	  if(account.getBalance() > account.withdrawl(10) )
    }
	
}


public class Bank extends Thread{
	
	
	
	public int balance = 50;
	

	public void withdrawl(int withdrawl) {
		balance -= withdrawl;
	}

	public int getBalance() {
		return balance;
	}

	

	public static void main(String[] args) {
		

	}

}
