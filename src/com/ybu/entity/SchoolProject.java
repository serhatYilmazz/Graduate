package com.ybu.entity;

import java.io.Serializable;

import javax.persistence.AssociationOverride;
import javax.persistence.AssociationOverrides;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "schools_projects")
@AssociationOverrides({
	@AssociationOverride(joinColumns = @JoinColumn(name = "school_id"), name = "pk.school"),
	@AssociationOverride(joinColumns = @JoinColumn(name = "project_id"), name = "pk.project")
})
public class SchoolProject {
	public static class SchoolProjectPk implements Serializable{
		
		@ManyToOne
		private School school;
		
		@ManyToOne
		private Project project;

		public School getSchool() {
			return school;
		}

		public void setSchool(School school) {
			this.school = school;
		}

		public Project getProject() {
			return project;
		}

		public void setProject(Project project) {
			this.project = project;
		}
	}
	
	@EmbeddedId
	private SchoolProjectPk pk = new SchoolProjectPk();

	public SchoolProjectPk getPk() {
		return pk;
	}

	public void setPk(SchoolProjectPk pk) {
		this.pk = pk;
	}
	
}
