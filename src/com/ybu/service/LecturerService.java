package com.ybu.service;

import java.util.List;

import com.ybu.entity.Lecturer;

public interface LecturerService {
	public List<Lecturer> getLecturers();

	public Lecturer getLecturer(String eMail);
}
