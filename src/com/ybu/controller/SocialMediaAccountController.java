package com.ybu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ybu.entity.SocialMediaAccount;
import com.ybu.service.SocialMediaAccountService;

@Controller
public class SocialMediaAccountController {
	
	@Autowired
	private SocialMediaAccountService socialMediaAccountService;
	
	@GetMapping("/accounts")
	public String listAccounts(@RequestParam("eMail") String eMail) {
		List<SocialMediaAccount> accounts = socialMediaAccountService.listAccounts(eMail);
		for(SocialMediaAccount s : accounts) {
			System.out.println(s.getPk().getStudent().getPk().getUser().getName());
			System.out.println(s.getSocial_media_address());
			System.out.println("---------");
		}
		return null;
	}
}
