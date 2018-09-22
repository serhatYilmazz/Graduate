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
@Table(name = "school_faculty")
@AssociationOverrides({
	@AssociationOverride(joinColumns = @JoinColumn(name = "school_id"), name = "pk.school"),
	@AssociationOverride(joinColumns = @JoinColumn(name = "faculty_id"), name = "pk.faculty")
})
public class SchoolFaculty {
	
	@Embeddable
	public static class SchoolFacultyPk implements Serializable{
		
		private static final long serialVersionUID = 1L;

		@ManyToOne
		private School school;
		
		@ManyToOne
		private Faculty faculty;

		public School getSchool() {
			return school;
		}

		public void setSchool(School school) {
			this.school = school;
		}

		public Faculty getFaculty() {
			return faculty;
		}

		public void setFaculty(Faculty faculty) {
			this.faculty = faculty;
		}
		
	}
	
	@EmbeddedId
	private SchoolFacultyPk pk = new SchoolFacultyPk();

	public SchoolFacultyPk getPk() {
		return pk;
	}

	public void setPk(SchoolFacultyPk pk) {
		this.pk = pk;
	}
}
