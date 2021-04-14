package com.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

import java.util.Iterator;

import java.io.BufferedReader;

public abstract class TheSystem {
    
    
	private HashMap<String, Item> itemCollection;

    public void setItemCollection(HashMap<String, Item> itemCollection) {
		this.itemCollection = itemCollection;
	}

    public HashMap<String, Item> getItemCollection(){
        return itemCollection;
        // Your code here
    }
    
    TheSystem() {
        itemCollection = new HashMap<String, Item>();

        if(getClass().getSimpleName().equals("AppSystem")) {
            
          
            
            try {
                FileReader myObj = new FileReader("resources/sample.txt");
                BufferedReader myReader = new BufferedReader(myObj);
                
                String line;
                while ( (line = myReader.readLine()) != null) {
                    String[] itemInfo = line.split("  ");
                    
                    String n = itemInfo[0];
                    String d = itemInfo[1];
                    Double p = Double.parseDouble(itemInfo[2]);
                    Integer q = Integer.parseInt(itemInfo[3]);
                    Item newItem = new Item(n, d, p, q);
                    
                    itemCollection.put(newItem.getItemName(), newItem);
                    System.out.println(itemInfo[2]);

                }

                  myReader.close();
                } 
                
         
         catch (Exception e) {
             System.out.println("An error occurred.");
             e.printStackTrace();
         }
        
    }
    
}
    


   
    

    public Boolean checkAvailability(Item item) {
        if(item.getAvailableQuantity() <= item.getQuantity()) {
            System.out.print("System is unable to add " + item.getItemName() + " to the card. System only has "+ item.getAvailableQuantity() + " " + item.getItemName() + "s.");
            return false;
        }
    
            return true;
        
    }
    
    public Boolean add(Item item) {
        if(item == null){
            return false;
        }
        else if(itemCollection.containsKey(item.getItemName())) {
            item.incrementQ();
            return true;
        }
        else if(itemCollection.get(item.getItemName()) == null){
            itemCollection.put(item.getItemName(), item);
            return true;
        }
        else {
            return false;
        }
    }

    public Item remove(String itemName) {
        if(itemCollection.containsKey(itemName)){
            Item remItem = itemCollection.get(itemName);
            itemCollection.remove(itemName);
            return remItem;
        }
        else {
            return null;
        }
    }

	
	public void display() {
		// TODO Auto-generated method stub
		
	}

   
}
