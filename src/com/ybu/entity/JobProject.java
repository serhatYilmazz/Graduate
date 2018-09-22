package com.ybu.entity;

import java.io.Serializable;

import javax.persistence.AssociationOverride;
import javax.persistence.AssociationOverrides;
import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "jobs_projects")
@AssociationOverrides({
	@AssociationOverride(joinColumns = @JoinColumn(name = "job_id"), name = "pk.job"),
	@AssociationOverride(joinColumns = @JoinColumn(name = "project_id"), name = "pk.project")
})
public class JobProject {
	
	@Embeddable
	public static class JobProjectPk implements Serializable{

		private static final long serialVersionUID = 1L;

		@ManyToOne
		private Job job;
		
		@ManyToOne
		private Project project;

		public Job getJob() {
			return job;
		}

		public void setJob(Job job) {
			this.job = job;
		}

		public Project getProject() {
			return project;
		}

		public void setProject(Project project) {
			this.project = project;
		}
		
	}
	
	@EmbeddedId
	private JobProjectPk pk = new JobProjectPk();

	public JobProjectPk getPk() {
		return pk;
	}

	public void setPk(JobProjectPk pk) {
		this.pk = pk;
	}
	
}
