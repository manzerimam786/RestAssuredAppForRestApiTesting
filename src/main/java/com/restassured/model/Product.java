package com.restassured.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ProductMaster1")
public class Product {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer productid;
	private String productname;
	private int price;
	private String category;
	private String availability;
	private String cod;
	private Date insertiondate;
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(int productid, String productname, int price, String category, String availability, String cod,
			Date insertiondate) {
		super();
		this.productid = productid;
		this.productname = productname;
		this.price = price;
		this.category = category;
		this.availability = availability;
		this.cod = cod;
		this.insertiondate = insertiondate;
	}
	public Integer getProductid() {
		return productid;
	}
	public void setProductid(Integer productid) {
		this.productid = productid;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getAvailability() {
		return availability;
	}
	public void setAvailability(String availability) {
		this.availability = availability;
	}
	public String getCod() {
		return cod;
	}
	public void setCod(String cod) {
		this.cod = cod;
	}
	public Date getInsertiondate() {
		return insertiondate;
	}
	public void setInsertiondate(Date insertiondate) {
		this.insertiondate = insertiondate;
	}
	@Override
	public String toString() {
		return "Product [productid=" + productid + ", productname=" + productname + ", price=" + price + ", category="
				+ category + ", availability=" + availability + ", cod=" + cod + ", insertiondate=" + insertiondate
				+ "]";
	}
}
