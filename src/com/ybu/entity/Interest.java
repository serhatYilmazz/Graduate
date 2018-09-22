package com.ybu.entity;

import java.io.Serializable;

import javax.persistence.AssociationOverride;
import javax.persistence.AssociationOverrides;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "interests")
@AssociationOverrides({
	@AssociationOverride(name = "pk.student", joinColumns = @JoinColumn(name = "student_e_mail"))
})
public class Interest {

	@Embeddable
	public static class InterestPk implements Serializable {
		
		private static final long serialVersionUID = 1L;
		
		@ManyToOne
		private Student student;
		
		public Student getStudent() {
			return student;
		}
		public void setStudent(Student student) {
			this.student = student;
		}		
		
	}
	
	@EmbeddedId
	private InterestPk pk = new InterestPk();
	
	@Column(name = "interest_name")
	private String interest_name;
	
	@Column(name = "status")
	private boolean status;

	public InterestPk getPk() {
		return pk;
	}

	public void setPk(InterestPk pk) {
		this.pk = pk;
	}

	public String getInterest_name() {
		return interest_name;
	}

	public void setInterest_name(String interest_name) {
		this.interest_name = interest_name;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
	
}
