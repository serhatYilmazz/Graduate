package com.ybu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ybu.dao.FacultyDAO;
import com.ybu.entity.Faculty;

@Service
public class FacultyServiceImpl implements FacultyService{

	@Autowired
	private FacultyDAO facultyDAO;
	
	@Override
	@Transactional
	public List<Faculty> getFaculties() {
		return facultyDAO.getFaculties();
	}

}
