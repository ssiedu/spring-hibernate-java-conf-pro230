package com.ssi;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StudentController {

	@Autowired
	private StudentService service;
	
	@RequestMapping("newstudent")
	public String showRegistrationForm(){
		return "studententry";
	}
	
	@RequestMapping("savestudent")
	public String saveStudentData(@ModelAttribute("student") Student student){
		
		service.createStudent(student);
		return "success";
	}
}
