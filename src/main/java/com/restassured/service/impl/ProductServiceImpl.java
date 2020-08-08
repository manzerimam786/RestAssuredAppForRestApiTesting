package com.restassured.service.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restassured.model.Product;
import com.restassured.repository.ProductRepository;

@Service
public class ProductServiceImpl {

	//Logger logger = LoggerFactory.getLogger(ProductServiceImpl.class);
	@Autowired
	ProductRepository productRepository;
	
	/*@Bean(name="entityManagerFactory")
	public LocalSessionFactoryBean sessionFactory() {
	    LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
	    return sessionFactory;
	} */
	public List<Product> getAllProducts()
	{
		List<Product> list = new ArrayList<Product>();
		Iterable<Product> iterable = productRepository.findAll();
		Iterator<Product> itr =  iterable.iterator();
		while(itr.hasNext())
		{
			Product product = (Product)itr.next();
			list.add(product);
		}
		return list;
	}
	
	public Product getProduct(String name) {
		Product product = productRepository.findByproductname(name);
		return product;
	}
	
	public void createProduct(Product product) {
		productRepository.save(product);
	}
	
	public Product updateProduct(int productid) {
		return null;
		//productRepository.sve(product);
	}
	
	public void deleteProduct(int id) {
	    productRepository.delete(id);	
	}
}