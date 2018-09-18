package com.ybu.controller;

import javax.persistence.NoResultException;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.ybu.entity.User;
import com.ybu.entity.UserLogin;
import com.ybu.service.UserService;

@Controller
public class LoginController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/")
	public String index(Model theModel) {
		theModel.addAttribute("userLogin", new UserLogin());
		return "login";
	}
	
	@PostMapping("/signIn")
	public String login(@ModelAttribute("userLogin") UserLogin userLogin, HttpSession session) {
		try {
			User user = userService.checkUser(userLogin.geteMail(), userLogin.getPassword());
			System.out.println(user.geteMail() + "\n" + user.getName());
			
			if(user.getRole() == User.ADMIN) {
				session.setAttribute("admin", user);
				return "redirect:/admin/theAdmin";
			}
			else if(user.getRole() == User.LECTURER) {
				session.setAttribute("lecturer", user);
				return "redirect:/lecturer/theLecturer";
			}
			else if(user.getRole() == User.STUDENT) {
				session.setAttribute("student", user);
				return "student";
			}
			else if(user.getRole() == User.INSTITUTION) {
				session.setAttribute("institution", user);
				return "institution";
			}
			
		} catch (NoResultException e) {
			return "redirect:/?act=err";
		}
		return "login";
	}
}
