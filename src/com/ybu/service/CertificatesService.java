package com.ybu.service;

import java.util.List;

import com.ybu.entity.Certificates;

public interface CertificatesService {
	List <Certificates> getCertificates(String eMail);
}
