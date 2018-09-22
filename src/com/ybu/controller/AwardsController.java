package com.ybu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ybu.entity.Awards;
import com.ybu.service.AwardsService;

@Controller
public class AwardsController {

	@Autowired
	private AwardsService awardsService;
	
	@GetMapping("/awards")
	public String getAwards(@RequestParam("eMail") String eMail) {
		List<Awards> awards = awardsService.getAwards(eMail);
		for(Awards a : awards) {
			System.out.println(a.getAward_name());
			System.out.println(a.getPk().getStudent().getPk().getUser().getName());
		}
		return null;
	}
}
