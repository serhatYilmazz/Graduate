package com.ybu.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ybu.entity.Department;

@Repository
public class DepartmentDAOImpl implements DepartmentDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public List<Department> getDepartments() {
		Session currentSession = sessionFactory.getCurrentSession();
		Query<Department> query = currentSession.createQuery("from Department", Department.class);
		return query.getResultList();
	}

}
