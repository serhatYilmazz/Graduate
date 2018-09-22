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
@Table(name = "students_jobs")
@AssociationOverrides({
	@AssociationOverride(joinColumns = @JoinColumn(name = "student_e_mail"), name = "pk.student"),
	@AssociationOverride(joinColumns = @JoinColumn(name = "job_id"), name = "pk.job")
})
public class StudentsJobs {

	@Embeddable
	public static class StudentsJobsPk implements Serializable {

		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		
		@ManyToOne
		private Student student;
		
		@ManyToOne
		private Job job;

		public Student getStudent() {
			return student;
		}

		public void setStudent(Student student) {
			this.student = student;
		}

		public Job getJob() {
			return job;
		}

		public void setJob(Job job) {
			this.job = job;
		}
		
	}
	
	@EmbeddedId
	private StudentsJobsPk pk = new StudentsJobsPk();

	public StudentsJobsPk getPk() {
		return pk;
	}

	public void setPk(StudentsJobsPk pk) {
		this.pk = pk;
	}
	
}
