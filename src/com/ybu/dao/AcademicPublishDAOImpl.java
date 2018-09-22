package com.ybu.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ybu.entity.AcademicPublish;

@Repository
public class AcademicPublishDAOImpl implements AcademicPublishDAO {

	@Autowired
	private SessionFactory sessionFactory; 
	
	@Override
	public List<AcademicPublish> getAcademicPublish(String eMail) {
		
		Session currentSession = sessionFactory.getCurrentSession();
		Query<AcademicPublish> academicPublish = currentSession.createQuery("from AcademicPublish where student_e_mail =: eMail", AcademicPublish.class);
		academicPublish.setParameter("eMail", eMail);
		return academicPublish.getResultList();
	}

}
