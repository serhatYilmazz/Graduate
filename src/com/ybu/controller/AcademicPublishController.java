package com.ybu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ybu.entity.AcademicPublish;
import com.ybu.service.AcademicPublishService;

@Controller
public class AcademicPublishController {

	@Autowired
	private AcademicPublishService academicPublisServise;
	
	@GetMapping("/academicPublish")
	public String getAcademicPublish(@RequestParam("eMail") String eMail) {
		List<AcademicPublish> academicPublish = academicPublisServise.getAcademicPublish(eMail);
		for(AcademicPublish ap : academicPublish) {
			System.out.println(ap.getPk().getStudent().getPk().getUser().getName());
			System.out.println(ap.getPublish_name());
			System.out.println("-----");
		}
		return null;
	}
}
