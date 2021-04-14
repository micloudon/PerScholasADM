package com.example;

import java.util.Map;

public class AppSystem extends TheSystem {
    AppSystem() {
    }
    
    @Override
    public void display() {
        System.out.println(this.getItemCollection().get("pizza"));
        String format1 = "%20s%20s";
        String format2 = "%10.2f";
        String format3 = "%10d\n";
        String format4 = "%10s";
        System.out.format(format1, "Name", "Description");
        System.out.format(format4, "Price");
        System.out.format(format4, "Available Quantity\n");
    
        for (Map.Entry<String, Item> itemEntry : this.getItemCollection().entrySet()) {
            System.out.format(format1, itemEntry.getValue().getItemName(), itemEntry.getValue().getItemDesc());
            System.out.format(format2, itemEntry.getValue().getItemPrice());
            System.out.format(format3, itemEntry.getValue().getAvailableQuantity());
		}
    }

    @Override      // this overwrites the parents class add method 
    public Boolean add(Item item) {
        if(item == null){
            return false;
        }
        else if(this.getItemCollection().containsKey(item.getItemName())) {
            System.out.println(item.getItemName() + " is already in the App System");
            return false;
        }
        else {
			this.getItemCollection().put(item.getItemName(), item);

			return true;
		}
    }

    public Item reduceAvailableQuantity(String item_name) {
        if(this.getItemCollection().get(item_name) != null) {
           
            this.getItemCollection().get(item_name).decrmentAq();
        }
        
        return null;
    }
}
