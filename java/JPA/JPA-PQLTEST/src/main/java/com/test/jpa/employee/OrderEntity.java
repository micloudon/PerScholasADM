package com.test.jpa.employee;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="orderdetails")
public class OrderEntity {
	@Id 
	Integer orderNumber;
	Integer orderLineNumber;
	String productCode;
	Integer priceEach;
	Integer quantityordered;

	
	
	public OrderEntity(Integer priceEach, Integer quantityordered, Integer orderNumber, Integer orderLineNumber, String productCode) {
		super();
		this.orderNumber = orderNumber;
		this.priceEach = priceEach;
		this.quantityordered = quantityordered;
		this.productCode = productCode;
		this.orderLineNumber = orderLineNumber;
	}
	
	
	public OrderEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public int getOrderNumbers() {
		return orderNumber;
	}

	public void setOrderNumbers(Integer orderNumber) {
		this.orderNumber = orderNumber;
	}
	public int getOrderLineNumber() {
		return orderLineNumber;
	}

	public void setOrderLineNumber(Integer orderLineNumber) {
		this.orderLineNumber = orderLineNumber;
	}

	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	public int getPriceEach() {
		return priceEach;
	}
	/**
	 * @param priceEach the priceEach to set
	 */
	public void setPriceEach(Integer priceEach) {
		this.priceEach = priceEach;
	}
	
	public int getQuantityorder() {
		return quantityordered;
	}
	/**
	 * @param quantityorder the quantityorder to set
	 */
	public void setQuantityorder(Integer quantityordered) {
		this.quantityordered = quantityordered;
	}
	
}
