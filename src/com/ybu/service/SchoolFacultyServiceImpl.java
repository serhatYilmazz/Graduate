package com.ybu.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ybu.dao.SchoolFacultyDAO;
import com.ybu.entity.SchoolFaculty;

@Service
public class SchoolFacultyServiceImpl implements SchoolFacultyService {
	
	@Autowired
	private SchoolFacultyDAO schoolFacultyDAO;
	
	@Override
	@Transactional
	public List<SchoolFaculty> getSchoolFaculty() {
		return schoolFacultyDAO.getSchoolFaculty();
	}

}
