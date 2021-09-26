package com.shivit.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.shivit.model.Course;

public interface ICourseRepo extends PagingAndSortingRepository<Course, Integer> {

}
