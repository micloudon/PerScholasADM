package ex3;

interface LibraryUser {
	String registerAccount();
	
	
	String requestBook();
}

class AdultUser implements LibraryUser {
	
	int age;
	String booktype;
	
	public AdultUser(int a, String book) {
		age = a;
		booktype = book;
	}

	public String registerAccount() {
		if(age > 12) {
			return "You have successfully registered under an Adult Account";
		}
		else {
			return "You must be older than 12 to use an Adult account";
		}
		
	}
	public String requestBook() {
		if(booktype == "Fiction") {
			return "Book Issued successfully, please return the book within 10 days";
		}
		else {
			return "Oops, you are allowed to take only adult fiction books";
		}
		
	}
	
}

class KidUser implements LibraryUser {

	int age;
	String booktype;

	public KidUser(int a, String book) {
		age = a;
		booktype = book;
	}

	public String registerAccount() {
		if(age < 12) {
			return "You have successfully registered under a Kids Account";
		}
		else {
			return "Sorry, Age must be less than 12 to egister as a kid";
		}
		
	}

	public String requestBook() {
		if(booktype == "Kids") {
			return "Book Issued successfully, please return the book within 10 days";
		}
		else {
			return "Oops, you are allowed to take only kids books";
		}
		
	}
	
}

public class Library {
	public static void main(String[] args) {
		LibraryUser ku = new KidUser(10, "Kids");
		System.out.println(ku.registerAccount());
		System.out.println(ku.requestBook());
		
		LibraryUser ku1 = new KidUser(18, "Fiction");
		System.out.println(ku1.registerAccount());
		System.out.println(ku1.requestBook());
		
		LibraryUser au = new AdultUser(5, "Kids");
		System.out.println(au.registerAccount());
		System.out.println(au.requestBook());
		
		LibraryUser au1 = new AdultUser(23, "Fiction");
		System.out.println(au1.registerAccount());
		System.out.println(au1.requestBook());
	}
}





