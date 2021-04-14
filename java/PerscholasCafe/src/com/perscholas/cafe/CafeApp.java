package com.perscholas.cafe;
import java.util.Scanner;

public class CafeApp {

	public static void main(String[] args) {
		Product coffee = new Product();
		coffee.setName("Coffee");
		coffee.setPrice(3);
		coffee.setDescription(" Cup of Java");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter coffee order quantity");
		coffee.setQuantity(sc.nextInt());
		
		Product espresso = new Product();
		espresso.setName("espresso");
		espresso.setPrice(4);
		espresso.setDescription(" Cup of C++");
		
		System.out.println("Enter espresso order quantity");
		espresso.setQuantity(sc.nextInt());
		
		Product cappuccino = new Product();
		cappuccino.setName("cappuccino");
		cappuccino.setPrice(5);
		cappuccino.setDescription(" Cup of JavaScript");
		
		System.out.println("Enter cappuccino order quantity");
		cappuccino.setQuantity(sc.nextInt());
		
		sc.close();
		
		System.out.println(coffee.getName());
		System.out.println(coffee.getDescription());
		System.out.println(coffee.calculateProductTotal(coffee.getPrice(), coffee.getQuantity()));
		System.out.println(coffee.calculateProductTotalTax(coffee.getPrice(), coffee.getQuantity()));
		System.out.println();
		
		System.out.println(espresso.getName());
		System.out.println(espresso.getDescription());
		System.out.println(espresso.calculateProductTotal(espresso.getPrice(), espresso.getQuantity()));
		System.out.println(espresso.calculateProductTotalTax(espresso.getPrice(), espresso.getQuantity()));
		System.out.println();
		
		System.out.println(cappuccino.getName());
		System.out.println(cappuccino.getDescription());
		System.out.println(cappuccino.calculateProductTotal(cappuccino.getPrice(), cappuccino.getQuantity()));
		System.out.println(cappuccino.calculateProductTotalTax(cappuccino.getPrice(), cappuccino.getQuantity()));
		
	}

}
