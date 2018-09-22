package com.ybu.dao;

import java.util.List;

import com.ybu.entity.Certificates;

public interface CertificatesDAO {
	List <Certificates> getCertificates(String eMail);
}
