package com.ybu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ybu.dao.LecturerDAO;
import com.ybu.entity.Lecturer;

@Service
public class LecturerServiceImpl implements LecturerService {
	
	@Autowired
	private LecturerDAO lecturerDAO;
	
	@Override
	public List<Lecturer> getLecturers() {
		return lecturerDAO.getLecturers();
	}

	@Override
	public Lecturer getLecturer(String eMail) {
		return lecturerDAO.getLecturer(eMail);
	}

}
