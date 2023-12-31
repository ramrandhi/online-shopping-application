package com.ram.microservices.orderservice.models;

import java.math.BigDecimal;

import org.springframework.data.annotation.Id;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;

@Entity
@Table(name="t_order_line_items")
public class OrderLineItems {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String skuCode;
	private BigDecimal price;
	private Integer quantity;
	
	public OrderLineItems(String skuCode, BigDecimal price, Integer quantity) {
		this.skuCode = skuCode;
		this.price = price;
		this.quantity = quantity;
	}
	
	public OrderLineItems() {
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getSkuCode() {
		return skuCode;
	}
	public void setSkuCode(String skuCode) {
		this.skuCode = skuCode;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	
}
