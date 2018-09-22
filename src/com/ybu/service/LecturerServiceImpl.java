package com.ybu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ybu.dao.LecturerDAO;
import com.ybu.entity.Lecturer;

@Service
public class LecturerServiceImpl implements LecturerService {
	
	@Autowired
	private LecturerDAO lecturerDAO;
	
	@Override
	@Transactional
	public List<Lecturer> getLecturers() {
		return lecturerDAO.getLecturers();
	}

	@Override
	@Transactional
	public Lecturer getLecturer(String eMail) {
		return lecturerDAO.getLecturer(eMail);
	}

}
