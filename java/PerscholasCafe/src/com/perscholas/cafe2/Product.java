package com.perscholas.cafe2;

public abstract class Product {
	public String name;
	public double price;
	public String description;
	private int quantity;
	
	Product() {
	}
	
	Product(String Cname, double Cprice, String Cdescription) {
		this.setName(Cname);
		this.setPrice(Cprice);
		this.setDescription(Cdescription);
		
	}
	
	abstract double calculateProductTotal(double price, int quantity);
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
}


class Coffee extends Product {
	
	public boolean milk;
	public boolean sugar;
	
	Coffee() {
		super(); {
			this.milk = false;
			this.sugar = false;
		}
	}
	
	Coffee(String Cname, double Cprice, String Cdescription) {
		super();
			this.name = Cname;
			this.price = Cprice;
			this.description = Cdescription;
			this.milk = false;
			this.sugar = false;
			
	}

	@Override
	public double calculateProductTotal(double price, int quantity) {
		double subtotal = price * quantity;
		return subtotal;
	}

	
	public boolean getMilk() {
		return milk;
	}

	public void setMilk(boolean milk) {
		this.milk = milk;
	}
	
	public boolean getSugar() {
		return sugar;
	}

	public void setSugar(boolean sugar) {
		this.sugar = sugar;
	}
	
}

class Espresso extends Product {
	
	public boolean extraShot;
	public boolean macchiato;
	
	Espresso() {
		super(); {
			this.extraShot = false;
			this.macchiato = false;
		}
	}
	
	Espresso(String Cname, double Cprice, String Cdescription) {
		super();
			this.name = Cname;
			this.price = Cprice;
			this.description = Cdescription;
			this.extraShot = false;
			this.macchiato = false;
			
	}
	

	@Override
	public double calculateProductTotal(double price, int quantity) {
		if(extraShot == true) {
			price += 2;
		}
		if(macchiato == true) {
			price += 1;
		}
		double subtotal = price * quantity;
		return subtotal;
	}

	
	public boolean getextraShot() {
		return extraShot;
	}

	public void setextraShot(boolean extraShot) {
		this.extraShot = extraShot;
	}
	
	public boolean getmacchiato() {
		return macchiato;
	}

	public void setmacchiato(boolean macchiato) {
		this.macchiato = macchiato;
	}
	
}

class Cappuccino extends Product {
	
	public boolean peppermint;
	public boolean whippedCream;
	
	Cappuccino() {
		super(); {
			this.peppermint = false;
			this.whippedCream = false;
		}
	}
	
	Cappuccino(String Cname, double Cprice, String Cdescription) {
		super();
			this.name = Cname;
			this.price = Cprice;
			this.description = Cdescription;
			this.peppermint = false;
			this.whippedCream = false;
			
	}

	@Override
	public double calculateProductTotal(double price, int quantity) {
		if(peppermint == true) {
			price += 2;
		}
		if(whippedCream == true) {
			price += 1;
		}
		double subtotal = price * quantity;
		return subtotal;
	}

	public boolean getpeppermint() {
		return peppermint;
	}

	public void setpeppermint(boolean peppermint) {
		this.peppermint = peppermint;
	}
	
	public boolean getwhippedCream() {
		return whippedCream;
	}

	public void setwhippedCream(boolean whippedCream) {
		this.whippedCream = whippedCream;
	}
	
}
	

	












