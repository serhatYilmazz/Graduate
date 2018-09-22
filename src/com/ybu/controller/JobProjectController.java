package com.ybu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.ybu.entity.JobProject;
import com.ybu.service.JobProjectService;

@Controller
public class JobProjectController {

	@Autowired
	private JobProjectService jobProjectService;
	
	@GetMapping("/jobProject")
	public String jobProject() {
		List<JobProject> list = jobProjectService.getJobProject();
		for(JobProject j : list) {
			System.out.println(j.getPk().getJob().getInstitution_name());
			System.out.println(j.getPk().getProject().getProjectTitle());
		}
		return null;
	}
}
