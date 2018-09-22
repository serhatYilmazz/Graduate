package com.ybu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.ybu.entity.SchoolFaculty;
import com.ybu.service.SchoolFacultyService;

@Controller
public class SchoolFacultyController {
	
	@Autowired
	private SchoolFacultyService schoolFacultyService;
	

	@GetMapping("/schoolFaculty")
	public String schoolFaculty() {
		List<SchoolFaculty> schools = schoolFacultyService.getSchoolFaculty();
		for(SchoolFaculty s : schools) {
			System.out.println(s.getPk().getSchool().getSchoolName());
			System.out.println(s.getPk().getFaculty().getFacultyName());
		}
		return "schoolFaculty";
	}
}
