package com.ybu.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ybu.entity.Language;

@Repository
public class LanguageDAOImpl implements LanguageDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public List<Language> listLanguages() {
		Session currentSession = sessionFactory.getCurrentSession();
		Query<Language> language = currentSession.createQuery("from Language", Language.class);
		return language.getResultList();
	}

}
