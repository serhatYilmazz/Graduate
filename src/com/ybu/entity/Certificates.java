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
@Table(name = "certificates")
@AssociationOverrides({
	@AssociationOverride(name = "pk.student", joinColumns = @JoinColumn(name = "student_e_mail"))
})
public class Certificates {

	@Embeddable
	public static class CertificatesPk implements Serializable{

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
	
	@EmbeddedId
	private CertificatesPk pk = new CertificatesPk();
	
	@Column(name = "certificate_name")
	private String certificate_name;
	
	@Column(name = "status")
	private boolean status;

	public CertificatesPk getPk() {
		return pk;
	}

	public void setPk(CertificatesPk pk) {
		this.pk = pk;
	}

	public String getCertificate_name() {
		return certificate_name;
	}

	public void setCertificate_name(String certificate_name) {
		this.certificate_name = certificate_name;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
	
}
