package com.ybu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ybu.dao.SocialMediaAccountDAO;
import com.ybu.entity.SocialMediaAccount;

@Service
public class SocialMediaAccountServiceImpl implements SocialMediaAccountService {

	@Autowired
	private SocialMediaAccountDAO socialMediaAccountDAO;
	
	@Override
	@Transactional
	public List<SocialMediaAccount> listAccounts(String eMail) {
		return socialMediaAccountDAO.listAccounts(eMail);
	}

}
