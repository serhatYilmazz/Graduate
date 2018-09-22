package com.ybu.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ybu.entity.StudentLanguage;

@Repository
public class StudentLanguageDAOImpl implements StudentLanguageDAO {

	@Autowired 
	private SessionFactory sessionFactory;
	
	@Override
	public List<StudentLanguage> listStudentLanguage() {
		Session currentSession = sessionFactory.getCurrentSession();
		Query<StudentLanguage> query = currentSession.createQuery("from StudentLanguage", StudentLanguage.class);
		return query.getResultList();
	}

}
