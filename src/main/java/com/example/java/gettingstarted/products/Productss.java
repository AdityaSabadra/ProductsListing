package com.example.java.gettingstarted.products;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="productss")
@Entity
public class Productss  {
	
	
	public Productss() {
		super();
	}

	public Productss(String description, String productName, String url) { //, byte[] image
		super();
		
		this.productName = productName;
		this.description = description;
		this.url = url;
		//this.image = image;
	}
	
	@Override
	public String toString() {
		return String.format("Products [productName=%s, description=%s, url=%s]", productName, description, url);
	}

	
	    
	
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public byte[] getImage() {
		return image;
	}
	public void setImage(byte[] image) {
		this.image = image;
	}
		
	   
	@Id    
	@Column(name="productName")
	private String productName;
	@Column(name="description")
	    private String description;
	@Column(name="url")
	    private String url;
	@Column(name="image")
	    private byte[] image;

	       
	    

}
