package com.ybu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ybu.dao.AcademicPublishDAO;
import com.ybu.entity.AcademicPublish;

@Service 
public class AcademicPublishServiceImpl implements AcademicPublishService {

	@Autowired
	private  AcademicPublishDAO academicPublishDAO;
	
	@Override
	@Transactional
	public List<AcademicPublish> getAcademicPublish(String eMail) {
		
		return academicPublishDAO.getAcademicPublish(eMail);
	}

}
