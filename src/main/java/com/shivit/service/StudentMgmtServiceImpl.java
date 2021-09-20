package com.shivit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.shivit.model.Student;
import com.shivit.repository.IStudentRepo;

@Service("studentService")
public class StudentMgmtServiceImpl implements IStudentMgmtService {
	
	@Autowired
	private IStudentRepo studentRepo;

	@Override
	public Iterable<Student> getAllStudents() {		
		return studentRepo.findAll(Sort.by("studentName").ascending());
	}

	@Override
	public String insertStudent(Student student) {
		return "Student inserted with Id value:: "+studentRepo.save(student).getStudentId();
	}

	@Override
	public Student getStudentByStudentId(int studentId) {
		return studentRepo.findById(studentId).get();
	}

	@Override
	public String updateStudent(Student student) {
		return studentRepo.save(student).getStudentId()+" Student updated.";
	}
    
	@Override
	public String deleteStudentByStudentId(int studentId) {
		studentRepo.deleteById(studentId);
		return studentId+" -student number student deleted.";
	}

}
