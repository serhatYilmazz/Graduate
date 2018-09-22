package com.ybu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.ybu.entity.StudentsSchools;
import com.ybu.service.StudentsSchoolsService;

@Controller
public class StudentsScoolsController {

	@Autowired
	private StudentsSchoolsService studentsSchoolsService;
	
	@GetMapping("/studentSchool")
	public String studentSchool() {
		List<StudentsSchools> studentSchool = studentsSchoolsService.getStundetsSchools();
		for(StudentsSchools s : studentSchool) {
			System.out.println(s.getPk().getStudent().getPk().getUser().getName());
			System.out.println(s.getPk().getSchool().getSchoolName());
		}
		return null;
	}
}
