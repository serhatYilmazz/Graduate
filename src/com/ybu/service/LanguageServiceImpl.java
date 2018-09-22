package com.ybu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ybu.dao.LanguageDAO;
import com.ybu.entity.Language;

@Service
public class LanguageServiceImpl implements LanguageService{

	@Autowired
	private LanguageDAO languageDAO;
	
	@Transactional
	@Override
	public List<Language> listLanguages() {
		return languageDAO.listLanguages();
	}
	
	
}
