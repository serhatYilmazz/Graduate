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
@Table(name = "awards")
@AssociationOverrides({
	@AssociationOverride(name = "pk.student", joinColumns = @JoinColumn(name = "student_e_mail"))
})
public class Awards {

	@Embeddable
	public static class AwardsPk implements Serializable{

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
	private AwardsPk pk = new AwardsPk();
	
	@Column(name = "award_name")
	private String award_name;
	
	@Column(name = "status")
	private boolean status;

	public AwardsPk getPk() {
		return pk;
	}

	public void setPk(AwardsPk pk) {
		this.pk = pk;
	}

	public String getAward_name() {
		return award_name;
	}

	public void setAward_name(String award_name) {
		this.award_name = award_name;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

}
