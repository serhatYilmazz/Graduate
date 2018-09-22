package com.ybu.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ybu.entity.Project;

@Repository
public class ProjectDAOImpl implements ProjectDAO{
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public List<Project> listProjects() {
		Session currentSession = sessionFactory.getCurrentSession();
		Query<Project> query = currentSession.createQuery("from Project", Project.class);
		return query.getResultList();
	}

}
