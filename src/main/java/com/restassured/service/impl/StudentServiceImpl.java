package com.restassured.service.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restassured.model.Student;
import com.restassured.repository.StudentRepository;


@Service
public class StudentServiceImpl {

	@Autowired
	StudentRepository studentRepository;
	
	/*@Bean(name="entityManagerFactory")
	public LocalSessionFactoryBean sessionFactory() {
	    LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
	    return sessionFactory;
	} */
	public List<Student> getAllStudents()
	{
		List<Student> list = new ArrayList<Student>();
		Iterable<Student> iterable = studentRepository.findAll();
		Iterator<Student> itr =  iterable.iterator();
		while(itr.hasNext())
		{
			Student student = (Student)itr.next();
			list.add(student);
		}
		return list;
	}
}