package com.ybu.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ybu.entity.SchoolProject;

@Repository
public class SchoolProjectDAOImpl implements SchoolProjectDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public List<SchoolProject> getSchoolProject() {
		Session currentSession = sessionFactory.getCurrentSession();
		Query<SchoolProject> schoolProject = currentSession.createQuery("from SchoolProject", SchoolProject.class);
		return schoolProject.getResultList();
	}

}
