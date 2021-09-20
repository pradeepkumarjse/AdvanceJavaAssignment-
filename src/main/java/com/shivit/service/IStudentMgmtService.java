package com.shivit.service;


import com.shivit.model.Student;

public interface IStudentMgmtService {
	public Iterable<Student> getAllStudents();
	//create
    public String insertStudent(Student student);
	//read
	public Student getStudentByStudentId(int studentId) ;
	//update
	public String updateStudent(Student student);
    //delete 
	public String deleteStudentByStudentId(int studentId);

}
