package com.incode.StudentRetrieve.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.incode.StudentRetrieve.Entity.Student;
import com.incode.StudentRetrieve.Service.StudentRetrieveService;

@RestController
@RequestMapping("/get")
public class StudentRetrieveController {
	
	@Autowired
	private StudentRetrieveService service;
	
	@GetMapping("/all")
	public List<Student> get(){
		return service.getAll();
	}
	
	@GetMapping("/getbyid/{id}")
	public Optional<Student> getWithId(@PathVariable Integer id) {
		return service.getById(id);
	}

}
