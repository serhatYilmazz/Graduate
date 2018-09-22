package com.ybu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.ybu.service.SchoolProjectService;
import com.ybu.entity.SchoolProject;

@Controller
public class SchoolProjectController {
	
	@Autowired
	private SchoolProjectService schoolProjectService;
	
	@GetMapping("/SchoolProject")
	public String SchoolProject() {
		List<SchoolProject> schoolProject = schoolProjectService.getSchoolProject();
		for(SchoolProject s : schoolProject) {
			System.out.println(s.getPk().getSchool().getSchoolName());
			System.out.println(s.getPk().getProject().getProjectSubject());
		}
		return null;
	}
}
