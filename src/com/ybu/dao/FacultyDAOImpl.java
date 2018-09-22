package com.ybu.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ybu.entity.Faculty;

@Repository
public class FacultyDAOImpl implements FacultyDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public List<Faculty> getFaculties() {
		Session currentSession = sessionFactory.getCurrentSession();
		Query<Faculty> query = currentSession.createQuery("from Faculty", Faculty.class);
		return query.getResultList();
	}

}
