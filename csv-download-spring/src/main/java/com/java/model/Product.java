package com.java.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Product")
public class Product {
	@Column(name="id")
	@Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name="name")
	private String name;
	@Column(name="brand")
	private String brand;
	@Column(name="color")
	private String color;
	@Column(name="Quantity")
	private String Quantity;
	@Column(name="price")
    private String price;
	public int getId() {
		return id;
	}
	public Product(int id, String name, String brand, String color, String quantity, String price) {
		super();
		this.id = id;
		this.name = name;
		this.brand = brand;
		this.color = color;
		Quantity = quantity;
		this.price = price;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getQuantity() {
		return Quantity;
	}
	public void setQuantity(String quantity) {
		Quantity = quantity;
	}
	public String getPrice() {
		return price;
	}
	public Product() {
		super();
		
	}
	public void setPrice(String price) {
		this.price = price;
	}
	

}
