package com.restassured.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.restassured.model.NewUser;

@Repository
public interface NewUserRepository extends JpaRepository<NewUser, Long> {

}
