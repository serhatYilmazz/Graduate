package com.ybu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ybu.dao.InterestDAO;
import com.ybu.entity.Interest;

@Service
public class InterestServiceImpl implements InterestService {

	@Autowired
	private InterestDAO interestDAO;
	
	@Override
	@Transactional
	public List<Interest> listInterest(String eMail) {
		return interestDAO.listInterest(eMail);
	}

}
