package com.ybu.service;

import java.util.List;

import com.ybu.entity.SocialMediaAccount;

public interface SocialMediaAccountService {
	public List<SocialMediaAccount> listAccounts(String eMail);
}
