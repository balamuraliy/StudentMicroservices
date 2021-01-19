package com.incode.StudentRetrieve.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.incode.StudentRetrieve.Entity.Student;

@Repository
public interface StudentRetrieveRepo extends JpaRepository<Student, Integer> {

	

}
