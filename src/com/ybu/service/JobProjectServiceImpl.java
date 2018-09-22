package com.ybu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ybu.dao.JobProjectDAO;
import com.ybu.entity.JobProject;

@Service
public class JobProjectServiceImpl implements JobProjectService {

	@Autowired
	private JobProjectDAO jobProjectDAO;

	@Override
	@Transactional
	public List<JobProject> getJobProject() {
		return jobProjectDAO.getJobProject();
	}
	
	
	
}
