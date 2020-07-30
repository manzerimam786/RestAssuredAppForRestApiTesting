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

import com.cucumber.model.Student;
import com.cucumber.service.impl.StudentServiceImpl;

@RestController
@CrossOrigin(origins="http://localhost:4200")
@RequestMapping("/students")
public class StudentController {


	@Autowired
	StudentServiceImpl studentService;
	@RequestMapping(value="/students", method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Student>> getAllStudents()
	{
		List<Student> list = studentService.getAllStudents();
		return new ResponseEntity<List<Student>>(list,HttpStatus.OK);
	}
}