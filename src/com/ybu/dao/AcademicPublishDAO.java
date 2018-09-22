package com.ybu.dao;

import java.util.List;

import com.ybu.entity.AcademicPublish;

public interface AcademicPublishDAO {
	List<AcademicPublish> getAcademicPublish(String eMail);
}
