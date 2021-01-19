package com.incode.StudentDelete.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.incode.StudentDelete.Entity.Student;

@Repository
public interface StudentDeleteRepo extends JpaRepository<Student, Integer>{

	
}
