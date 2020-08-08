package com.restassured.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.restassured.model.Product;


@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

	Product findByproductname(String name);
}
