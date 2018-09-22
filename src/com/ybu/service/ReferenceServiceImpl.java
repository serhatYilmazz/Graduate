package com.ybu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ybu.dao.ReferenceDAO;
import com.ybu.entity.Reference;

@Service
public class ReferenceServiceImpl implements ReferenceService {
	
	@Autowired
	private ReferenceDAO referenceDAO;

	@Override
	@Transactional
	public List<Reference> getReference() {
		return referenceDAO.getReference();
	}

	
	
}
