package com.ybu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.ybu.entity.Institution;
import com.ybu.service.InstitutionService;

@Controller
public class InstitutionController {
	
	@Autowired
	private InstitutionService institutionService;
	
	@GetMapping("/listInstitution")
	public String getInstitutions() {
		List<Institution> ins = institutionService.getInstitution();
		for(Institution i : ins) {
			System.out.println(i.getInstitutionEMail());
		}
		return "index-page";
	}
}
