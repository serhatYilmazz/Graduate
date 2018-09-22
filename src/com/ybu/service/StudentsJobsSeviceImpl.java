package com.ybu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ybu.dao.StudentsJobsDAO;
import com.ybu.entity.StudentsJobs;

@Service
public class StudentsJobsSeviceImpl implements StudentsJobsService {
	
	@Autowired
	private StudentsJobsDAO studentsJobsDAO;

	@Transactional
	@Override
	public List<StudentsJobs> getStudentsJobs() {		
		return studentsJobsDAO.getStudentsJobs();
	}

}
