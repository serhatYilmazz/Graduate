package com.ybu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ybu.dao.JobDAO;
import com.ybu.entity.Job;

@Service
public class JobServiceImpl implements JobService {

	@Autowired
	private JobDAO jobDAO;
	
	@Transactional
	@Override
	public List<Job> getJob() {
		return jobDAO.getJob();
	}

}
