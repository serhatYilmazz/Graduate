package com.ybu.dao;

import java.util.List;

import com.ybu.entity.Awards;

public interface AwardsDAO {
	List<Awards> getAwards(String eMail);
}
