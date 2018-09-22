package com.ybu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.ybu.entity.StudentsJobs;
import com.ybu.service.StudentsJobsService;

@Controller
public class StudentsJobsController {

	@Autowired
	private StudentsJobsService studentsJobsService;
	
	@GetMapping("/studentsJobs")
	public String listStudentsJobs() {
		List<StudentsJobs> list = studentsJobsService.getStudentsJobs();
		for(StudentsJobs s : list) {
			System.out.println(s.getPk().getStudent().getPk().getUser().getName());
			System.out.println(s.getPk().getJob().getInstitution_name());
		}
		return null;
	}
}
