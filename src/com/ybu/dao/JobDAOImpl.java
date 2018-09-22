package com.ybu.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ybu.entity.Job;

@Repository
public class JobDAOImpl implements JobDAO {
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public List<Job> getJob() {
		Session currentSession = sessionFactory.getCurrentSession();
		Query<Job> jobs = currentSession.createQuery("from Job", Job.class);
		return jobs.getResultList();
	}

}
