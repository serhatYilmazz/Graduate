package com.ybu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.ybu.entity.Job;
import com.ybu.service.JobService;

@Controller
public class JobController {

	@Autowired
	private JobService jobService;
	
	@GetMapping("/listJob")
	public String listJob(Model theModel) {
		List<Job> listJob = jobService.getJob();
		theModel.addAttribute("users", listJob);
		for(Job j : listJob) {
			System.out.println(j.getInstitution_name()+" "+j.getInstitution_name());
		}
		return "studentProfile";
	}
	
}
