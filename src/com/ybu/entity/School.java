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
@Table(name = "schools")
public class School {
	
	@Id
	@SequenceGenerator(name = "schools_seq", sequenceName = "schools_seq")
	@GeneratedValue(generator = "schools_seq", strategy=GenerationType.SEQUENCE)
	@Column(name = "school_id")
	private int school_id;
	
	@Column(name = "school_name")
	private String schoolName;
	
	@Column(name = "status")
	private boolean status;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "pk.school", cascade = CascadeType.ALL)
	private Set<SchoolFaculty> schoolFaculty = new HashSet<>(0);
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "pk.school", cascade = CascadeType.ALL)
	private Set<StudentsSchools> studentsSchools = new HashSet<>();
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "pk.school")
	private Set<SchoolProject> schoolProjects = new HashSet<>(0);
	
	public int getSchool_id() {
		return school_id;
	}

	public void setSchool_id(int school_id) {
		this.school_id = school_id;
	}

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public Set<SchoolFaculty> getSchoolFaculty() {
		return schoolFaculty;
	}

	public void setSchoolFaculty(Set<SchoolFaculty> schoolFaculty) {
		this.schoolFaculty = schoolFaculty;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public Set<StudentsSchools> getStudentsSchools() {
		return studentsSchools;
	}

	public void setStudentsSchools(Set<StudentsSchools> studentsSchools) {
		this.studentsSchools = studentsSchools;
	}

	public Set<SchoolProject> getSchoolProjects() {
		return schoolProjects;
	}

	public void setSchoolProjects(Set<SchoolProject> schoolProjects) {
		this.schoolProjects = schoolProjects;
	}
	
}
