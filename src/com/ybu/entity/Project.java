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
@Table(name = "projects")
public class Project {
	
	@Id
	@SequenceGenerator(name = "projects_seq", sequenceName = "projects_seq")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "projects_seq")
	@Column(name = "project_id")
	private int projectID;
	
	@Column(name = "project_title")
	private String projectTitle;
	
	@Column(name = "project_subject")
	private String projectSubject;
	
	@Column(name = "project_summary_file_path")
	private String projectSummaryPath;
	
	@Column(name = "status")
	private boolean status;
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "pk.project")
	private Set<JobProject> jobProjects = new HashSet<>(0);

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "pk.project")
	private Set<SchoolProject> schoolProjects = new HashSet<>(0);
	
	public int getProjectID() {
		return projectID;
	}

	public void setProjectID(int projectID) {
		this.projectID = projectID;
	}

	public String getProjectTitle() {
		return projectTitle;
	}

	public void setProjectTitle(String projectTitle) {
		this.projectTitle = projectTitle;
	}

	public String getProjectSubject() {
		return projectSubject;
	}

	public void setProjectSubject(String projectSubject) {
		this.projectSubject = projectSubject;
	}

	public String getProjectSummaryPath() {
		return projectSummaryPath;
	}

	public void setProjectSummaryPath(String projectSummaryPath) {
		this.projectSummaryPath = projectSummaryPath;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
}
