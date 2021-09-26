package com.shivit.controller;

import java.util.Map;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.shivit.model.Course;
import com.shivit.model.Student;
import com.shivit.service.ICourseMgmtService;
import com.shivit.service.IStudentMgmtService;

@Controller
public class StudentAndCourseController {
	
	@Autowired
	private IStudentMgmtService studentService;
	@Autowired
	private ICourseMgmtService courseService;

	@GetMapping("/")
	public String showHome() {
		System.out.println("StudentAndCourseController.showHome()");
		return "home";
	}
	
	/*
	   CRUD OPERATIONS ON STUDENTS
	 */
	
	@GetMapping("/student_record")
	public String showStudentReport(Map<String,Object> map) {		
		//use service
		Iterable<Student> studsList=studentService.getAllStudents();
		
		//keep results as model attribute
		map.put("studsList", studsList);		
		
		return "student_report";
		
	}
	

	@GetMapping("/insert_student")
	public String showAddStudentForm(@ModelAttribute("stud") Student stud) {
		
		//return LVN
		return "add_student";
	}

	@PostMapping("/insert_employee")
	public String insertEmployee(RedirectAttributes attrs, @ModelAttribute("stud") Student stud)
	{
		//use service
		String result=studentService.insertStudent(stud);
		//add results to model attribute
		attrs.addFlashAttribute("resultMsg", result);
		//return LVN
		return "redirect:student_record";
	}
	
	
	
	
	@GetMapping("/edit_student")
	public String showEditStudentFormPage(@RequestParam("sno") int sno,
											@ModelAttribute("emp") Student stud) {
		//use service
		Student stud1=studentService.getStudentByStudentId(sno);
		BeanUtils.copyProperties(stud1, stud);
		//return lvn
		return "modify_student";
		
	}
	
	@PostMapping("/edit_student")
	public String editStudent(RedirectAttributes attrs,@ModelAttribute("stud") Student stud) {
		//use service
		String result=studentService.updateStudent(stud);
		//keep results in model attributes
		attrs.addFlashAttribute("resultMsg", result);
		//return LVN
		return "redirect:student_record";
	}

	@GetMapping("/delete_student")
	public String deleteStudent(@RequestParam("sno") int sno,RedirectAttributes attrs) {
		 //use service
		String result=studentService.deleteStudentByStudentId(sno);
		//keep results in model attributes
		attrs.addFlashAttribute("resultMsg", result);
		//return LVN
		return "redirect:student_record";
		
	}
	
	
	
	/*
	   CRUD OPERATIONS ON COURSES
	 
	 */
	
	@GetMapping("/course_record")
	public String showCourseReport(Map<String,Object> map) {		
		//use service
		Iterable<Course> courList=courseService.getAllCourses();
		
		//keep results as model attribute
		map.put("courList", courList);		
		
		return "course_report";
		
	}
	

	@GetMapping("/insert_course")
	public String showAddCourseForm(@ModelAttribute("cour") Course cour) {		
		//return LVN
		return "add_course";
	}

	@PostMapping("/insert_course")
	public String insertCourse(RedirectAttributes attrs, @ModelAttribute("cour") Course cour) {
	
		//use service
		String result=courseService.insertCourse(cour);
		//add results to model attribute
		attrs.addFlashAttribute("resultMsg1", result);
		//return LVN
		return "redirect:course_record";
	}
	
	
	
	
	@GetMapping("/edit_course")
	public String showEditCourseFormPage(@RequestParam("cno") int cno,
											@ModelAttribute("cour") Course cour) {
		//use service
		Course cour1=courseService.getCourseByCourseId(cno);
		BeanUtils.copyProperties(cour1, cour);
		//return lvn
		return "modify_course";
		
	}
	
	@PostMapping("/edit_course")
	public String editCourse(RedirectAttributes attrs,@ModelAttribute("cour") Course cour) {
		//use service
		String result=courseService.updateCourse(cour);
		//keep results in model attributes
		attrs.addFlashAttribute("resultMsg1", result);
		//return LVN
		return "redirect:course_record";
	}

	@GetMapping("/delete_course")
	public String deleteCourse(@RequestParam("cno") int cno,RedirectAttributes attrs) {
		 //use service
		String result=courseService.deleteCourseByCourseId(cno);
		//keep results in model attributes
		attrs.addFlashAttribute("resultMsg1", result);
		//return LVN
		return "redirect:course_record";
		
	}

}
