package com.perscholas.cafe2;

import java.util.Scanner;

public class CafeApp {

	public static void main(String[] args) {
		Coffee coffee = new Coffee();
		coffee.setName("Coffee");
		coffee.setPrice(3);
		coffee.setDescription(" Cup of Java");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter coffee order quantity");
		coffee.setQuantity(sc.nextInt());
		
		Espresso espresso = new Espresso();
		espresso.setName("espresso");
		espresso.setPrice(4);
		espresso.setDescription(" Cup of C++");
		espresso.setextraShot(true);
		espresso.setmacchiato(true);
		
		System.out.println("Enter espresso order quantity");
		espresso.setQuantity(sc.nextInt());
		
		Cappuccino cappuccino = new Cappuccino();
		cappuccino.setName("cappuccino");
		cappuccino.setPrice(5);
		cappuccino.setDescription(" Cup of JavaScript");
		
		System.out.println("Enter cappuccino order quantity");
		cappuccino.setQuantity(sc.nextInt());
		
		sc.close();
		
		System.out.println(coffee.getName());
		System.out.println(coffee.getDescription());
		System.out.println(coffee.calculateProductTotal(coffee.getPrice(), coffee.getQuantity()));
		System.out.println();
		
		System.out.println(espresso.getName());
		System.out.println(espresso.getDescription());
		System.out.println(espresso.calculateProductTotal(espresso.getPrice(), espresso.getQuantity()));

		System.out.println();
		
		System.out.println(cappuccino.getName());
		System.out.println(cappuccino.getDescription());
		System.out.println(cappuccino.calculateProductTotal(cappuccino.getPrice(), cappuccino.getQuantity()));
		
	}

}

