package com.incode.StudentUpdate.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.incode.StudentUpdate.Entity.Student;
import com.incode.StudentUpdate.Repo.StudentUpdateRepo;

@Service
public class StudentUpdateService {

	@Autowired
	private StudentUpdateRepo repo;

	@Autowired
	private RestTemplate restTemplate;
	
	final String url = "http://STUDENTRETRIEVE-SERVICE/get/getbyid/";

	public Student updateBranch(Integer id, String branch) {

		Student student = restTemplate.getForObject(url + id, Student.class);
		student.setSbranch(branch);
		repo.save(student);
		return student;
	}

	public Student updateAge(Integer id, Integer age) {
		Student student = restTemplate.getForObject(url + id, Student.class);
		student.setSage(age);
		repo.save(student);
		return student;
	}
}
