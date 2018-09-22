package com.ybu.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ybu.entity.JobProject;

@Repository
public class JobProjectDAOImpl implements JobProjectDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public List<JobProject> getJobProject() {
		Session currentSession = sessionFactory.getCurrentSession();
		Query<JobProject> jobProject = currentSession.createQuery("from JobProject", JobProject.class);
		return jobProject.getResultList();
	}

}
