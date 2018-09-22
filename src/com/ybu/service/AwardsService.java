package com.ybu.service;

import java.util.List;

import com.ybu.entity.Awards;

public interface AwardsService {
	List<Awards> getAwards(String eMail);
}
