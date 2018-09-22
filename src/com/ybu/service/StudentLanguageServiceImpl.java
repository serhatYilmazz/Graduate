package com.ybu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ybu.dao.StudentLanguageDAO;
import com.ybu.entity.StudentLanguage;

@Service
public class StudentLanguageServiceImpl implements StudentLanguageService {
	
	@Autowired
	private StudentLanguageDAO studentLanguageDAO;
	
	@Override
	@Transactional
	public List<StudentLanguage> listStudentLanguage() {
		return studentLanguageDAO.listStudentLanguage();
	}

}
