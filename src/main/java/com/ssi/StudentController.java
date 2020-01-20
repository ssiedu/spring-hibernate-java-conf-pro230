package com.ssi;


import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentController {

	@Autowired
	private StudentService service;
	
	@RequestMapping("newstudent")
	public ModelAndView showRegistrationForm(){
		ModelAndView mv=new ModelAndView("studententry");
		Student student=new Student();
		mv.addObject("student",student);
		return mv;
	}
	
	@RequestMapping("savestudent")
	public String saveStudentData(@Valid @ModelAttribute("student") Student student, BindingResult result){
		if(result.hasErrors()) {
			return "studententry";
		}
		
		service.createStudent(student);
		return "success";
	}
}
