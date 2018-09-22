package com.ybu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ybu.dao.SchoolDAO;
import com.ybu.entity.School;

@Service
public class SchoolServiceImpl implements SchoolService {
	
	@Autowired
	private SchoolDAO schoolDAO;
	
	@Override
	@Transactional
	public List<School> listSchools() {
		return schoolDAO.listSchools();
	}

}
