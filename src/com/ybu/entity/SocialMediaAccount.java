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
@Table(name = "social_media_accounts")
@AssociationOverrides({
	@AssociationOverride(name = "pk.student", joinColumns = @JoinColumn(name = "student_e_mail"))
})
public class SocialMediaAccount {
	
	
	@Embeddable
	public static class SocialMediaAccountPk implements Serializable{
		
		/**
		 * 
		 */
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
	
	@Column(name = "social_media_address")
	private String social_media_address;
	
	@Column(name = "status")
	private boolean status;
	
	@EmbeddedId
	private SocialMediaAccountPk pk = new SocialMediaAccountPk();

	public String getSocial_media_address() {
		return social_media_address;
	}

	public void setSocial_media_address(String social_media_address) {
		this.social_media_address = social_media_address;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public SocialMediaAccountPk getPk() {
		return pk;
	}

	public void setPk(SocialMediaAccountPk pk) {
		this.pk = pk;
	}
	
}
