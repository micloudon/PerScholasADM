package com.example;

import java.util.Map;

public class CartSystem extends TheSystem {
    CartSystem() {
    }

    @Override
    public void display() {
            
            String format1 = "%20s%20s";
            String format2 = "%10.2f";
            String format3 = "%10d\n";
            String format4 = "%10s";
            System.out.format(format1, "Name", "Description");
            System.out.format(format4, "Price");
            System.out.format(format4, "Available Quantity\n");
    
        for (Map.Entry<String, Item> itemEntry : this.getItemCollection().entrySet()) {
            Double subtotal = itemEntry.getValue().getItemPrice() * itemEntry.getValue().getQuantity();
			// System.out.println("Name   " + "description  " + "Price   " + "Available Quantity");
            Double preTaxTotal = subtotal * itemEntry.getValue().getQuantity();
            Double tax = preTaxTotal * 0.05;
            Double total = preTaxTotal + tax;
            System.out.format(format1, itemEntry.getValue().getItemName(), itemEntry.getValue().getItemDesc());
            System.out.format(format2, itemEntry.getValue().getItemPrice());
            System.out.format(format3, itemEntry.getValue().getAvailableQuantity());
		}
            
            // System.out.format("%20s\n%20s\n%20s\n",preTaxTotal , tax, total);
		}
}


