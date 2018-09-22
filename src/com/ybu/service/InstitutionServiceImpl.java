package com.ybu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ybu.dao.InstitutionDAO;
import com.ybu.entity.Institution;

@Service
public class InstitutionServiceImpl implements InstitutionService {
	
	@Autowired
	private InstitutionDAO institutionDAO;
	
	@Transactional
	@Override
	public List<Institution> getInstitution() {
		return institutionDAO.getInstitution();
	}

}
