package com.perscholas.cafe;

public class Product {
	private String name;
	private double price;
	private String description;
	private int quantity;
	private double tax = 1.1;
	
	Product() {
	}
	
	Product(String Cname, double Cprice, String Cdescription) {
		this.setName(Cname);
		this.setPrice(Cprice);
		this.setDescription(Cdescription);
		
	}
	
	double calculateProductTotal(double price, int quantity) {
		double subtotal = price * quantity;
		return subtotal;
	}
	
	double calculateProductTotalTax(double price, int quantity) {
		double salestotal = price * quantity * tax;
		return salestotal;
	}

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
