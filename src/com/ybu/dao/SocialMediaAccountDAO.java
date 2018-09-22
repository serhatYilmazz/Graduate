package com.ybu.dao;

import java.util.List;

import com.ybu.entity.SocialMediaAccount;

public interface SocialMediaAccountDAO {
	public List<SocialMediaAccount> listAccounts(String eMail);
}
