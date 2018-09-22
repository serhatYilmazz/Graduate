package com.ybu.entity;


import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "jobs")

public class Job {

	@SequenceGenerator(name = "jobs_sequence", sequenceName = "jobs_sequence", initialValue = 1)
	@GeneratedValue(generator = "jobs_sequence", strategy=GenerationType.SEQUENCE)
	@Id
	@Column(name = "job_id")
	private int job_id;
	
	@Column(name = "institution_name")
	private String institution_name;
	
	@Column(name = "position")
	private String position;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "start_date")
	private Date start_date;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "end_date")
	private Date end_date;
	
	@Column(name = "department")
	private String department;
	
	@Column(name = "status")
	private boolean status;
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "pk.job")
	private Set<StudentsJobs> studentsJobs = new HashSet<StudentsJobs>();
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "pk.job")
	private Set<JobProject> jobProjects = new HashSet<>(0);
	
	public int getJob_id() {
		return job_id;
	}
	
	public void setJob_id(int job_id) {
		this.job_id = job_id;
	}

	public String getInstitution_name() {
		return institution_name;
	}

	public void setInstitution_name(String institution_name) {
		this.institution_name = institution_name;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public Date getStart_date() {
		return start_date;
	}

	public void setStart_date(Date start_date) {
		this.start_date = start_date;
	}

	public Date getEnd_date() {
		return end_date;
	}

	public void setEnd_date(Date end_date) {
		this.end_date = end_date;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public Set<StudentsJobs> getStudentsJobs() {
		return studentsJobs;
	}

	public void setStudentsJobs(Set<StudentsJobs> studentsJobs) {
		this.studentsJobs = studentsJobs;
	}	

}
