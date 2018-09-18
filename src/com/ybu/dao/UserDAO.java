package com.ybu.dao;

import com.ybu.entity.User;

public interface UserDAO {
	public User checkUser(String eMail, String password);
	public User getUserByEMail(String eMail);
	public void addUser(User user);
}
