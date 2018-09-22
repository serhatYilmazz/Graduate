package com.ybu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ybu.dao.CertificatesDAO;
import com.ybu.entity.Certificates;

@Service
public class CertificatesServiceImpl implements CertificatesService{

	@Autowired
	private CertificatesDAO certificatesDAO;
	
	@Override
	@Transactional
	public List<Certificates> getCertificates(String eMail) {
		return certificatesDAO.getCertificates(eMail);
	}

}
