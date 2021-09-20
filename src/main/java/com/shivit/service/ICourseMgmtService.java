package com.shivit.service;

import com.shivit.model.Course;

public interface ICourseMgmtService {
	public Iterable<Course> getAllCourses();
	//create
    public String insertCourse(Course course);
	//read
	public Course getCourseByCourseId(int courseId) ;
	//update
	public String updateCourse(Course course);
    //delete 
	public String deleteCourseByCourseId(int courseId);

}
