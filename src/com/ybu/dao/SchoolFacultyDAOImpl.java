package com.ybu.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ybu.entity.SchoolFaculty;

@Repository
public class SchoolFacultyDAOImpl implements SchoolFacultyDAO {
	
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public List<SchoolFaculty> getSchoolFaculty() {
		Session currentSession = sessionFactory.getCurrentSession();
		Query<SchoolFaculty> schoolFaculty = currentSession.createQuery("from SchoolFaculty", SchoolFaculty.class);
		return schoolFaculty.getResultList();
	}

}
