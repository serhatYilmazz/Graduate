package com.ybu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.ybu.entity.Faculty;
import com.ybu.service.FacultyService;

@Controller
public class FacultyController {
	
	@Autowired
	private FacultyService facultyService;
	
	@GetMapping("/listFaculties")
	public String listFaculties() {
		List<Faculty> faculties = facultyService.getFaculties();
		for(Faculty f : faculties) {
			System.out.println(f.getFacultyName());
		}
		return "faculty";
	}
}
