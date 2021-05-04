package com.update;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Item")
public class ItemEntity {
	
	@Id
	@GeneratedValue( strategy = GenerationType.AUTO )
	@Column(name="id")
	private Integer id;
	private String itemName;
	private Double price;
	
	@OneToOne(mappedBy = "itemEn")
	OrderItemMapping orderItemMapping;
	
	public ItemEntity(String itemName, Double price) {
		super();
//		this.itemId = itemId;
		this.itemName = itemName;
		this.price = price;
	}
	
	
	public ItemEntity() {
		super();
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}


	public String getItemName() {
		return itemName;
	}


	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
}
