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
@Table(name = "users")
public class User{
	public final static int ADMIN = 1;
	public final static int LECTURER = 2;
	public final static int STUDENT = 3;
	public final static int INSTITUTION = 4;
	
	@SequenceGenerator(name = "users_seq", sequenceName = "users_seq", initialValue = 1)
	@GeneratedValue(generator = "users_seq", strategy=GenerationType.SEQUENCE)
	@Column(name = "user_id")
	private int user_id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "surname")
	private String surname;
	
	@Id
	@Column(name = "e_mail")
	private String eMail;
	
	@Column(name = "password")
	private String password;
	
	@Column(name = "phone")
	private String phone;
	
	@Column(name = "role")
	private int role;
	
	@OneToMany(mappedBy = "pk.user", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private Set<Student> students = new HashSet<Student>(0);

	@OneToMany(mappedBy = "pk.user", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private Set<Lecturer> lecturers = new HashSet<>(0);
	
	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String geteMail() {
		return eMail;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getRole() {
		return role;
	}

	public void setRole(char role) {
		this.role = role;
	}

	public Set<Student> getStudents() {
		return students;
	}

	public void setStudents(Set<Student> students) {
		this.students = students;
	}

	public Set<Lecturer> getLecturers() {
		return lecturers;
	}

	public void setLecturers(Set<Lecturer> lecturers) {
		this.lecturers = lecturers;
	}
	
}
