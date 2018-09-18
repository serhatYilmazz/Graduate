package com.ybu.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ybu.entity.Lecturer;
import com.ybu.service.LecturerService;

@Controller
@RequestMapping("lecturer")
public class LecturerController {
	
	@Autowired
	private LecturerService lecturerService;
	
	@GetMapping("/listLecturers")
	public String listLecturers(Model theModel) {
		List<Lecturer> lecturers = lecturerService.getLecturers();
		theModel.addAttribute("lecturers", lecturers);
		for(Lecturer l : lecturers) {
			System.out.println(l.getPk().getUser().geteMail());
		}
		return "index-page";
	}
	
	@GetMapping("/theLecturer")
	public String getLecturer(HttpSession session) {
		if(session.getAttribute("lecturer") != null) {
			return "lecturer";
		}
		
		return "redirect:/";
	}
	
}
