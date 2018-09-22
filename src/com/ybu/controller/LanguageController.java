package com.ybu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.ybu.entity.Language;
import com.ybu.service.LanguageService;

@Controller
public class LanguageController {
	
	@Autowired
	private LanguageService languageService;
	
	@GetMapping("/listLanguages")
	public String listLanguages() {
		List<Language> language = languageService.listLanguages();
		for(Language l : language) {
			System.out.println(l.getLanguageName());
		}
		return null;
	}
		
}
