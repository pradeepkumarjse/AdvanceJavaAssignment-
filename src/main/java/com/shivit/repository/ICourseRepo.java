package com.shivit.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shivit.model.Course;

public interface ICourseRepo extends JpaRepository<Course, Integer> {

}
