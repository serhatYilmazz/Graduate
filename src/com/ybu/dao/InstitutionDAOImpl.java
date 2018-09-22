package com.ybu.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ybu.entity.Institution;

@Repository
public class InstitutionDAOImpl implements InstitutionDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public List<Institution> getInstitution() {
		Session currentSession = sessionFactory.getCurrentSession();
		Query<Institution> institutions = currentSession.createQuery("from Institution", Institution.class);
		return institutions.getResultList();
	}

}
