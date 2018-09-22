package com.ybu.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "department")
public class Department {
	
	@Id
	@SequenceGenerator(name = "department_seq", sequenceName = "department_seq")
	@GeneratedValue(generator = "department_seq", strategy=GenerationType.SEQUENCE)
	@Column(name = "department_id")
	private int department_id;
	
	@Column(name = "department_name")
	private String departmentName;
	
	@ManyToOne
	@JoinColumn(name = "faculty_id")
	private Faculty faculty_id;

	public int getDepartment_id() {
		return department_id;
	}

	public void setDepartment_id(int department_id) {
		this.department_id = department_id;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public Faculty getFaculty_id() {
		return faculty_id;
	}

	public void setFaculty_id(Faculty faculty_id) {
		this.faculty_id = faculty_id;
	}
	
}
