package com.ybu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.ybu.entity.Reference;
import com.ybu.service.ReferenceService;

@Controller
public class ReferenceController {

	@Autowired
	private ReferenceService referenceServise;
	
	@GetMapping("/reference")
	public String getReference() {
		List<Reference> reference = referenceServise.getReference();
		for(Reference r : reference) {
			System.out.println(r.getPk().getLecturer().getPk().getUser().getName());
			System.out.println(r.getPk().getStudent().getPk().getUser().getName());
		}
		return null;
	}
}
