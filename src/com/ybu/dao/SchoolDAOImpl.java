package com.ybu.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ybu.entity.School;

@Repository
public class SchoolDAOImpl implements SchoolDAO {

	@Autowired 
	private SessionFactory sessionFactory;
	
	@Override
	public List<School> listSchools() {
		Session currentSession = sessionFactory.getCurrentSession();
		Query<School> query = currentSession.createQuery("from School", School.class);
		return query.getResultList();
	}

}
