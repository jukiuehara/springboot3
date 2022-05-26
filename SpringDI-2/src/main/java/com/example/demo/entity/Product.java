package com.example.demo.entity;

import org.springframework.stereotype.Repository;

@Repository
public class Product{
	private int productId;
	private String productName;
	private int price;
	
	public int getProductId() {
		return productId;
	}
	
	public Product(int id , String name, int price) {
		this.productId = id;
		this.productName = name;
		this.price = price;
		
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Product() {
		
	}


}
