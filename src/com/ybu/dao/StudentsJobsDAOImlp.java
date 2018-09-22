package com.ybu.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ybu.entity.StudentsJobs;

@Repository
public class StudentsJobsDAOImlp implements StudentsJobsDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public List<StudentsJobs> getStudentsJobs() {
		Session currentSession = sessionFactory.getCurrentSession();
		Query<StudentsJobs> query = currentSession.createQuery("from StudentsJobs", StudentsJobs.class);
		return query.getResultList();
	}

	
}
