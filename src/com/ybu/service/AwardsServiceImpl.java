package com.ybu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ybu.dao.AwardsDAO;
import com.ybu.entity.Awards;

@Service
public class AwardsServiceImpl implements AwardsService {

	@Autowired
	private AwardsDAO awardsDAO;
	
	@Override
	@Transactional
	public List<Awards> getAwards(String eMail) {
		return awardsDAO.getAwards(eMail);
	}

	
}
