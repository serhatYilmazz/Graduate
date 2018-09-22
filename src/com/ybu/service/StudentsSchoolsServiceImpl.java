package com.ybu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ybu.dao.StudentsSchoolsDAO;
import com.ybu.entity.StudentsSchools;

@Service
public class StudentsSchoolsServiceImpl implements StudentsSchoolsService {

	@Autowired
	private  StudentsSchoolsDAO studentsSchoolsDAO;
	
	@Override
	@Transactional
	public List<StudentsSchools> getStundetsSchools() {		
		return studentsSchoolsDAO.getStundetsSchools();
	}

}
