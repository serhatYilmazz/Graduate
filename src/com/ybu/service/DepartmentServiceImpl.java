package com.ybu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ybu.dao.DepartmentDAO;
import com.ybu.entity.Department;

@Service
public class DepartmentServiceImpl implements DepartmentService {
	
	@Autowired
	private DepartmentDAO departmentDAO;
	
	@Transactional
	@Override
	public List<Department> getDepartments() {
		return departmentDAO.getDepartments();
	}

}
