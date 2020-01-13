package com.ssi;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProjectController {
	@RequestMapping("/test")
	public String check(){
		return "success";
	}
}
