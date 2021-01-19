package com.incode.StudentSave.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.incode.StudentSave.Entity.Student;
import com.incode.StudentSave.Service.StudentService;

@RestController
@RequestMapping("/save")
public class StudentController {

	@Autowired
	private StudentService studentService;
	


	@PostMapping("/")
	public Student saveStudent(@RequestBody Student stu) {
		return studentService.saveStudent(stu);
	}

}
