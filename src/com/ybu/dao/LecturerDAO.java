package com.ybu.dao;

import java.util.List;

import com.ybu.entity.Lecturer;

public interface LecturerDAO {
	public List<Lecturer> getLecturers();
	public Lecturer getLecturer(String eMail);
}
