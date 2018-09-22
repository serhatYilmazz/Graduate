package com.ybu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ybu.entity.Interest;
import com.ybu.service.InterestService;

@Controller
public class InterestController {

	@Autowired
	private InterestService interestService;
	
	@GetMapping("/interest")
	public String interest(@RequestParam("eMail") String eMail) {
		List<Interest> interest = interestService.listInterest(eMail);
		for(Interest i : interest) {
			System.out.println(i.getPk().getStudent().getPk().getUser().getName());
			System.out.println(i.getInterest_name());
			System.out.println("-----");
		}
		return null;
	}
	
}
