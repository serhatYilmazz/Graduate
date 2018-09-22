package com.ybu.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "faculty")
public class Faculty {
	
	@Id
	@SequenceGenerator(name = "faculty_seq", sequenceName = "faculty_seq")
	@GeneratedValue(generator = "faculty_seq", strategy=GenerationType.SEQUENCE)
	@Column(name = "faculty_id")
	private int faculty_id;
	
	@Column(name = "faculty_name")
	private String facultyName;

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "pk.faculty")
	private Set<SchoolFaculty> schoolFaculty = new HashSet<>(0);
	
	public int getFaculty_id() {
		return faculty_id;
	}

	public void setFaculty_id(int faculty_id) {
		this.faculty_id = faculty_id;
	}

	public String getFacultyName() {
		return facultyName;
	}

	public void setFacultyName(String facultyName) {
		this.facultyName = facultyName;
	}

	public Set<SchoolFaculty> getSchoolFaculty() {
		return schoolFaculty;
	}

	public void setSchoolFaculty(Set<SchoolFaculty> schoolFaculty) {
		this.schoolFaculty = schoolFaculty;
	}

}
