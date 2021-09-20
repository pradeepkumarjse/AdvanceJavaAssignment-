package com.shivit.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.shivit.model.Student;

public interface IStudentRepo extends JpaRepository<Student, Integer> {
	

}
