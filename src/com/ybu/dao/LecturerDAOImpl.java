package com.ybu.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ybu.entity.Lecturer;

@Repository
public class LecturerDAOImpl implements LecturerDAO{
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	@Transactional
	public List<Lecturer> getLecturers() {
		Session currentSession = sessionFactory.getCurrentSession();
		Query<Lecturer> lecturers = currentSession.createQuery("from Lecturer", Lecturer.class);
		return lecturers.getResultList();
	}

	@Transactional
	@Override
	public Lecturer getLecturer(String eMail) {
		Session currentSession = sessionFactory.getCurrentSession();
		Query<Lecturer> lecturer = currentSession.createQuery("from Lecturer where lecturer_e_mail = :eMail", Lecturer.class);
		lecturer.setParameter("eMail", eMail);
		return lecturer.getSingleResult();
	}

}
