package com.incode.StudentUpdate.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.incode.StudentUpdate.Entity.Student;
@Repository
public interface StudentUpdateRepo  extends JpaRepository<Student, Integer> {

}
