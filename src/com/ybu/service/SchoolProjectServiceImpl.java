package com.ybu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ybu.dao.SchoolProjectDAO;
import com.ybu.entity.SchoolProject;

@Service
public class SchoolProjectServiceImpl implements SchoolProjectService {

	@Autowired
	private SchoolProjectDAO schoolProjectDAO;

	@Override
	@Transactional
	public List<SchoolProject> getSchoolProject() {
		return schoolProjectDAO.getSchoolProject();
	}
	
	
}
