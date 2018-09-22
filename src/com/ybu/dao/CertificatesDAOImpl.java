package com.ybu.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ybu.entity.Certificates;

@Repository
public class CertificatesDAOImpl implements CertificatesDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public List<Certificates> getCertificates(String eMail) {
		Session currentSession = sessionFactory.getCurrentSession();
		Query<Certificates> certificates = currentSession.createQuery("from Certificates where student_e_mail =: eMail", Certificates.class);
		certificates.setParameter("eMail", eMail);
		return certificates.getResultList();
	}

}
