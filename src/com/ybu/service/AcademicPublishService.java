package com.ybu.service;

import java.util.List;

import com.ybu.entity.AcademicPublish;

public interface AcademicPublishService {
	List<AcademicPublish> getAcademicPublish(String eMail);
}
