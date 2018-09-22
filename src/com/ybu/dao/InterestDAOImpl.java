package com.ybu.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ybu.entity.Interest;

@Repository
public class InterestDAOImpl implements InterestDAO{
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public List<Interest> listInterest(String eMail) {
		Session currentSession = sessionFactory.getCurrentSession();
		Query<Interest> interest = currentSession.createQuery("from Interest where student_e_mail =: eMail", Interest.class);;
		interest.setParameter("eMail", eMail);
		return interest.getResultList();
	}

}
