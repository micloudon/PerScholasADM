package com.example;

public class Item{
    
    private String itemName;
    private String itemDesc;
    private Double itemPrice;
    private Integer quantity = 1;
    private Integer availableQuantity;
    
    public Item() {
        quantity = 1;
    }
    
    public Item(String itemName, String itemDesc, Double itemPrice, Integer availableQuantity) {
        this.itemName = itemName;
        this.itemDesc = itemDesc;
        this.itemPrice = itemPrice;
        this.availableQuantity = availableQuantity;
    }

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getItemDesc() {
		return itemDesc;
	}

	public void setItemDesc(String itemDesc) {
		this.itemDesc = itemDesc;
	}

	public Double getItemPrice() {
		return itemPrice;
	}

	public void setItemPrice(Double itemPrice) {
		this.itemPrice = itemPrice;
	}

	public Integer getQuantity() {
		
		return quantity;
	}

	public void incrementQ() {
		quantity++;
	}

	public void decrmentAq() {
		availableQuantity -= 1;
	}
	
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Integer getAvailableQuantity() {
		return availableQuantity;
	}

	public void setAvailableQuantity(Integer availableQuantity) {
		this.availableQuantity = availableQuantity;
	}
    

    
    
}
