package com.ybu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.ybu.entity.Student;
import com.ybu.service.StudentService;

@Controller
@SessionAttributes("studentSession")
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@GetMapping("/listStudent")
	public String listStudent() {
		List<Student> list = studentService.getStudent();
		for(Student s : list) {
			System.out.println(s.getPk().getUser().geteMail() + " "+ s.getBirthDate());
		}
		return "index-page";
	}
}
