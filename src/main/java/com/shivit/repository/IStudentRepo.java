package com.shivit.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.shivit.model.Student;

public interface IStudentRepo extends PagingAndSortingRepository<Student, Integer> {
	

}
