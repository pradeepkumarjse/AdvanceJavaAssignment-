package com.shivit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.shivit.model.Course;
import com.shivit.repository.ICourseRepo;

@Service("courseService")
public class CourseMgmtServiceImpl implements ICourseMgmtService {

	@Autowired
	private ICourseRepo courseRepo;
	
	@Override
	public Iterable<Course> getAllCourses() {
		return courseRepo.findAll(Sort.by("courseName").ascending());
	}

	@Override
	public String insertCourse(Course course) {
		return "Student inserted with Id value:: "+courseRepo.save(course).getCourseId();
	}

	@Override
	public Course getCourseByCourseId(int courseId) {
		return courseRepo.findById(courseId).get();
	}

	@Override
	public String updateCourse(Course course) {
		return courseRepo.save(course).getCourseId()+" Course updated.";
	}

	@Override
	public String deleteCourseByCourseId(int courseId) {
		courseRepo.deleteById(courseId);
		return courseId+" -course number course deleted.";
	}

}
