package com.restassured.service.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restassured.repository.ProductRepository;
import com.restassured.model.Product;

@Service
public class ProductServiceImpl {

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
}