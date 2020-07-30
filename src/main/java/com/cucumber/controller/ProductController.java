package com.cucumber.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cucumber.model.Product;
import com.cucumber.service.impl.ProductServiceImpl;

@RestController
@CrossOrigin(origins="http://localhost:4200")
@RequestMapping("/products")
public class ProductController {


	@Autowired
	ProductServiceImpl productServiceImpl;
	@RequestMapping(value="/products", method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Product>> getAllProducts()
	{
		List<Product> list = productServiceImpl.getAllProducts();
		return new ResponseEntity<List<Product>>(list,HttpStatus.OK);
	}
}