package com.update;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="OrdItemMap")
public class OrderItemMapping {
	
	@Id
	@Column(name = "order_ID")
	private Integer orderId;
	
	@Column(name = "item_ID")
	private Integer ItemId;
	
	@OneToOne(cascade = CascadeType.ALL)
	@PrimaryKeyJoinColumn(name="order_ID", referencedColumnName="id")
	private OrderEntity orderEn;
	
	@OneToOne(cascade = CascadeType.ALL)
	@PrimaryKeyJoinColumn(name="item_ID", referencedColumnName="id")
	private ItemEntity itemEn;
	
	
	
	
	
	public OrderItemMapping(Integer orderId, Integer itemId) {
		super();
		this.orderId = orderId;
		ItemId = itemId;
	}
	
	public OrderItemMapping() {
		
	}
	
	public Integer getOrderId() {
		return orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public Integer getItemId() {
		return ItemId;
	}

	public void setItemId(Integer itemId) {
		ItemId = itemId;
	}

	
}
