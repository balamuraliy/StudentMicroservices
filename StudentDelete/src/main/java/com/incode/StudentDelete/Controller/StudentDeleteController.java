package com.incode.StudentDelete.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.incode.StudentDelete.Service.StudentDeleteService;
@RestController
@RequestMapping("/del")
public class StudentDeleteController {

	@Autowired
	private StudentDeleteService service;

	@DeleteMapping("/{id}")
	public String deleteRecord(@PathVariable Integer id) {
		service.delete(id);
		return "Record deleted";
	}
}
