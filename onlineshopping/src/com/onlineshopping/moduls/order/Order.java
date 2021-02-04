package com.onlineshopping.moduls.order;

import java.util.Date;
import java.util.Set;

import com.lsmp.mp.product.Product;

/**
 * This is an order model class
 * 
 *
 */

public class Order {

	//Instances
	private int orderID;
	private double orderAmount;
	private Date orderDate;
	private Set<Product> products;
		
	
	public Integer getOrderID() {
		return orderID;
	}
	public void setOrderID(Integer orderID) {
		this.orderID = orderID;
	}
	
	
	public Double getOrderAmount() {
		return orderAmount;
	}
	public void setOrderAmount(Double  orderAmount) {
		this.orderAmount =  orderAmount;
	}

	public Date getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Date  orderDate) {
		this.orderDate =  orderDate;
	}
	public Set<Product> getProducts() {
		return products;
	}
	public void setProducts(Set<Product> products) {
		this.products = products;
	}
	
}
