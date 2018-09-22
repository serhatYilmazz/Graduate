package com.ybu.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ybu.entity.User;

@Repository
public class UserDAOImpl implements UserDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public User checkUser(String eMail, String password) {
		Session currentSession = sessionFactory.getCurrentSession();
		Query<User> user = currentSession.createQuery("from User where e_mail = :eMail and password = :password", User.class);
		user.setParameter("eMail", eMail);
		user.setParameter("password", password);
		return user.getSingleResult();
	}

	@Override
	public User getUserByEMail(String eMail) {
		Session currentSession = sessionFactory.getCurrentSession();
		Query<User> user = currentSession.createQuery("from User where e_mail = :eMail", User.class);
		user.setParameter("eMail", eMail);
		return user.getSingleResult();
	}

	@Override
	public void addUser(User user) {
		Session currentSession = sessionFactory.getCurrentSession();
		currentSession.save(user);
	}

}
