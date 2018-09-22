package com.ybu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.ybu.entity.StudentLanguage;
import com.ybu.service.StudentLanguageService;

@Controller
public class StudentLanguageController {
	
	@Autowired
	private StudentLanguageService studentLanguageService;
	
	@GetMapping("/listStudentLanguage")
	public String listStudentLanguage() {
		List<StudentLanguage> studentLanguage = studentLanguageService.listStudentLanguage();
		for(StudentLanguage s : studentLanguage) {
			System.out.println(s.getPk().getStudent().getPk().getUser().getName());
			System.out.println(s.getPk().getLanguage().getLanguageName());
		}
		return null;
	}
	
}
