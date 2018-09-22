package com.ybu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ybu.dao.ProjectDAO;
import com.ybu.entity.Project;

@Service
public class ProjectServiceImpl implements ProjectService{
	
	@Autowired
	private ProjectDAO projectDAO;
	
	@Override
	@Transactional
	public List<Project> listProjects() {
		return projectDAO.listProjects();
	}
	
}
