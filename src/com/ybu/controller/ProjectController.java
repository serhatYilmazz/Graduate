package com.ybu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.ybu.entity.Project;
import com.ybu.service.ProjectService;


@Controller
public class ProjectController {
	
	@Autowired
	private ProjectService projectService;
	
	@GetMapping("/listProjects")
	public String listProjects() {
		List<Project> projects = projectService.listProjects();
		for(Project p : projects) {
			System.out.println(p.getProjectSubject());
		}
		return null;
	}
}
