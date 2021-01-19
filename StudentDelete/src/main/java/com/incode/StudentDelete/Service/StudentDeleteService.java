package com.incode.StudentDelete.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.incode.StudentDelete.Repo.StudentDeleteRepo;

@Service
public class StudentDeleteService {
	@Autowired
	private StudentDeleteRepo repo;

	public void delete(Integer id) {
		repo.deleteById(id);

	}

}
