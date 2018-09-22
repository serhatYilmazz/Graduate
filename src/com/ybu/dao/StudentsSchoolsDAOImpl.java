package com.ybu.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ybu.entity.StudentsSchools;

@Repository
public class StudentsSchoolsDAOImpl implements StudentsSchoolsDAO{
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public List<StudentsSchools> getStundetsSchools() {
		Session currentSession = sessionFactory.getCurrentSession();
		Query<StudentsSchools> studentsSchools = currentSession.createQuery("from StudentsSchools", StudentsSchools.class);
		return studentsSchools.getResultList();
	}

}
