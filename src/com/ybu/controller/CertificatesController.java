package com.ybu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ybu.entity.Certificates;
import com.ybu.service.CertificatesService;

@Controller
public class CertificatesController {
	
	@Autowired
	private CertificatesService certificatesService;
	
	@GetMapping("/certificates")
	public String certificates(@RequestParam("eMail") String eMail) {
		List<Certificates> certificates = certificatesService.getCertificates(eMail);
		for(Certificates c : certificates) {
			System.out.println(c.getPk().getStudent().getPk().getUser().getName());
			System.out.println(c.getCertificate_name());
			System.out.println("-----");
		}
		return null;
	}
}
