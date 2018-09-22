package com.ybu.dao;

import java.util.List;

import com.ybu.entity.Interest;

public interface InterestDAO {
	public List<Interest> listInterest(String eMail);
}
