package com.ybu.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ybu.entity.Reference;

@Repository
public class ReferenceDAOImpl implements ReferenceDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public List<Reference> getReference() {
		Session currentSession = sessionFactory.getCurrentSession();
		Query<Reference> reference = currentSession.createQuery("from Reference", Reference.class);
		return reference.getResultList();
	}

}
