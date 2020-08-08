package com.restassured.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.restassured.model.Product;
import com.restassured.service.impl.ProductServiceImpl;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/products")
public class ProductController {

	@Autowired
	ProductServiceImpl productServiceImpl;

	@RequestMapping(value = "/products", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Product>> getAllProducts() {
		List<Product> list = productServiceImpl.getAllProducts();
		return new ResponseEntity<List<Product>>(list, HttpStatus.OK);
	}

	@RequestMapping(value = "/{productName}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Product> getProduct(@PathVariable("productName") String productName) {
		Product product = productServiceImpl.getProduct(productName);
		if (product == null)
			throw new RuntimeException("Invalid product name : " + productName);
		return new ResponseEntity<Product>(product, HttpStatus.OK);
	}

	@RequestMapping(value = "/create", method = RequestMethod.POST)
	public ResponseEntity<Void> addProduct(@RequestBody Product product) {
		productServiceImpl.createProduct(product);
		return new ResponseEntity<Void>(HttpStatus.CREATED);
	}

	@RequestMapping(value = "/update/{productid}", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Product> updateProduct(@RequestBody Product product, Integer productid) {
		Product product2 = productServiceImpl.updateProduct(productid);
		return new ResponseEntity<Product>(product2, HttpStatus.OK);
	}

	@RequestMapping(value = "/delete/{productid}", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Void> deleteProduct(@PathVariable("productid") int productid) {
		productServiceImpl.deleteProduct(productid);
		return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
	}
}