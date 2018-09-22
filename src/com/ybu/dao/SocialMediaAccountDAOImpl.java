package com.ybu.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ybu.entity.SocialMediaAccount;

@Repository
public class SocialMediaAccountDAOImpl implements SocialMediaAccountDAO{

	@Autowired 
	private SessionFactory sessionFactory;
	
	@Override
	public List<SocialMediaAccount> listAccounts(String eMail) {
		
		Session currentSession = sessionFactory.getCurrentSession();
		Query<SocialMediaAccount> accounts = currentSession.createQuery("from SocialMediaAccount where student_e_mail =: eMail", SocialMediaAccount.class);
		accounts.setParameter("eMail", eMail);
		return accounts.getResultList();
	}

}
