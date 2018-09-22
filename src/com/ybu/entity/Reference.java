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
@Table(name = "reference")
@AssociationOverrides({
	@AssociationOverride(joinColumns = @JoinColumn(name = "lecturer_e_mail"), name = "pk.lecturer"),
	@AssociationOverride(joinColumns = @JoinColumn(name = "student_e_mail"), name = "pk.student")	
})
public class Reference {

	@Embeddable
	public static class ReferencePk implements Serializable {

		private static final long serialVersionUID = 1L;
		
		@ManyToOne
		private Student student;
		
		@ManyToOne
		private Lecturer lecturer;

		public Student getStudent() {
			return student;
		}

		public void setStudent(Student student) {
			this.student = student;
		}

		public Lecturer getLecturer() {
			return lecturer;
		}

		public void setLecturer(Lecturer lecturer) {
			this.lecturer = lecturer;
		}
		
	}
	
	@EmbeddedId
	private ReferencePk pk = new ReferencePk();

	public ReferencePk getPk() {
		return pk;
	}

	public void setPk(ReferencePk pk) {
		this.pk = pk;
	}
	
}
