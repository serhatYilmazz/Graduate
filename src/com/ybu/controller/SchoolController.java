package com.ybu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.ybu.entity.School;
import com.ybu.service.SchoolService;

@Controller
public class SchoolController {
	
	@Autowired
	private SchoolService schoolService;
	
	@GetMapping("/listSchools")
	public String listSchools() {
		List<School> schools = schoolService.listSchools();
		for(School s : schools) {
			System.out.println(s.getSchoolName());
		}
		return "school";
	}
	
	
}
