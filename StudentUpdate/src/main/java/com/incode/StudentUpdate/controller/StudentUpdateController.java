package com.incode.StudentUpdate.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.incode.StudentUpdate.Entity.Student;
import com.incode.StudentUpdate.Service.StudentUpdateService;

@RestController
@RequestMapping("/update")
public class StudentUpdateController {
	@Autowired
	private StudentUpdateService service;
	
	
	@GetMapping("/branch/{id}/{branch}")
	public Student updateBranch(@PathVariable Integer id,@PathVariable String branch) {	
		return service.updateBranch(id, branch);
		 
	}
	
    @GetMapping("/age/{id}/{age}")
    public Student updateAge(@PathVariable Integer id, @PathVariable Integer age) {
    	return service.updateAge(id, age);
    	 
    }
}
