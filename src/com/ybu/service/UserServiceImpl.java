package com.ybu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ybu.dao.UserDAO;
import com.ybu.entity.User;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserDAO userDAO;
	
	@Transactional
	@Override
	public User checkUser(String eMail, String password) {
		return userDAO.checkUser(eMail, password);
	}

	@Override
	@Transactional
	public User getUser(String eMail) {
		return userDAO.getUserByEMail(eMail);
	}

	@Override
	@Transactional
	public void addUser(User user) {
		userDAO.addUser(user);
	}

}
