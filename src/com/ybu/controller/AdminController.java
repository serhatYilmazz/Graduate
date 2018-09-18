package com.ybu.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ybu.entity.User;
import com.ybu.service.UserService;

@Controller
@RequestMapping("/admin")
public class AdminController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/theAdmin")
	public String admin(HttpSession session) {
		if(session.getAttribute("admin") != null) {
			return "admin";
		}
		
		return "redirect:/";
	}
	
	@GetMapping("/logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "redirect:/";
	}
	
	@GetMapping("/addSchool")
	public String addSchool() {
		return "admin_operations/school_operations/add_school";
	}

	@GetMapping("/addInstitution")
	public String addInstitution() {
		return "admin_operations/institution_operation/add_institution";
	}
	
	@GetMapping("/addFaculty")
	public String addFaculty() {
		return "admin_operations/school_operations/add_faculty";
	}
	
	@GetMapping("/addDepartment")
	public String addDepartment() {
		return "admin_operations/school_operations/add_department";
	}
	
	@GetMapping("/addAdmin")
	public String addAdmin(Model theModel) {
		theModel.addAttribute("admin", new User());
		return "admin_operations/admin_operation/add_admin";
	}
	
	@PostMapping("/addAdmin")
	public String addAdminPost(@ModelAttribute("admin") User user) {
		userService.addUser(user);
		return "redirect:/theAdmin";
	}
}
