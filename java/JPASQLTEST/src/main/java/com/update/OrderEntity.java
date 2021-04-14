package com.update;

import javax.persistence.CascadeType;
import javax.persistence.Column;
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
@Table(name="OrderEN")
public class OrderEntity {

	@Id
	@GeneratedValue( strategy = GenerationType.AUTO )
	@Column(name="id")
	private Integer id;
	private String orderTime;
	private Double totalRevenue;
	private Double tax;
	

	@OneToOne(mappedBy = "orderEn")
	OrderItemMapping orderItemMapping;
	
	public OrderEntity(String orderTime, Double totalRevenue, Double tax) {
		super();
//		this.orderId = orderId;
		this.orderTime = orderTime;
		this.totalRevenue = totalRevenue;
		this.tax = tax;
	}
	
	public OrderEntity() {
		super();
	
	}
	
	public Integer getId() {
		return id;
	}
	
//	@OneToOne(fetch=FetchType.LAZY)
//	@JoinColumn(name="id")
	public void setId(Integer id) {
		this.id = id;
	}
	
	public Double getTotalRevenue() {
		return totalRevenue;
	}
	public void setTotalRevenue(Double totalRevenue) {
		this.totalRevenue = totalRevenue;
	}
	public Double getTax() {
		return tax;
	}
	public void setTax(Double tax) {
		this.tax = tax;
	}

	public String getDateOfOrder() {
		return orderTime;
	}

	public void setDateOfOrder(String dateOfOrder) {
		this.orderTime = dateOfOrder;
	}

}
