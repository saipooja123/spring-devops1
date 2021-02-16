
package com.myapp.spring.model;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="newproducts")
public class Product {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
    private Integer productId;
    private String productName;
    private Double price;
    private String description;
    
    public Product() {
        // TODO Auto-generated constructor stub
    }
    
    public Product(String productName, Double price, String description) {
        this.productName = productName;
        this.price = price;
        this.description = description;
    }
    public Integer getProductId() {
        return productId;
    }
}