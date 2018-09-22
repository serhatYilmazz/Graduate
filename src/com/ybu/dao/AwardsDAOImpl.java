package com.ybu.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ybu.entity.Awards;

@Repository
public class AwardsDAOImpl implements AwardsDAO{

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public List<Awards> getAwards(String eMail) {
		Session currentSession = sessionFactory.getCurrentSession();
		Query<Awards> awards = currentSession.createQuery("from Awards where student_e_mail =: eMail", Awards.class);
		awards.setParameter("eMail", eMail);
		return awards.getResultList();
	}

}
