package com.ybu.service;

import com.ybu.entity.User;

public interface UserService {
	public User checkUser(String eMail, String password);

	public User getUser(String eMail);

	public void addUser(User user);
}
