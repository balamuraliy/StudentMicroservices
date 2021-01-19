package com.incode.StudentRetrieve.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.incode.StudentRetrieve.Entity.Student;
import com.incode.StudentRetrieve.Repo.StudentRetrieveRepo;

@Service
public class StudentRetrieveService {
	@Autowired
	private StudentRetrieveRepo repo;

	public List<Student> getAll() {

		return repo.findAll();

	}

	public Optional<Student> getById(Integer id) {
		return repo.findById(id);
	}

}
