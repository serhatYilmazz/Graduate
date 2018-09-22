package com.ybu.entity;

import java.io.Serializable;
import java.util.Date;

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
@Table(name = "academic_publish")
@AssociationOverrides({
	@AssociationOverride(name = "pk.student", joinColumns = @JoinColumn(name = "student_e_mail"))
})
public class AcademicPublish {

	@Embeddable
	public static class AcademicPublishPk implements Serializable {

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
	AcademicPublishPk pk = new AcademicPublishPk();
	
	@Column(name = "publish_name")
	private String publish_name;
	
	@Column(name = "publish_date")
	private Date publish_date;
	
	@Column(name = "publish_file_path")
	private String publish_file_path;
	
	@Column(name = "publish_field")
	private String publish_field;
	
	@Column(name = "status")
	private boolean status;

	public AcademicPublishPk getPk() {
		return pk;
	}

	public void setPk(AcademicPublishPk pk) {
		this.pk = pk;
	}

	public String getPublish_name() {
		return publish_name;
	}

	public void setPublish_name(String publish_name) {
		this.publish_name = publish_name;
	}

	public Date getPublish_date() {
		return publish_date;
	}

	public void setPublish_date(Date publish_date) {
		this.publish_date = publish_date;
	}

	public String getPublish_file_path() {
		return publish_file_path;
	}

	public void setPublish_file_path(String publish_file_path) {
		this.publish_file_path = publish_file_path;
	}

	public String getPublish_field() {
		return publish_field;
	}

	public void setPublish_field(String publish_field) {
		this.publish_field = publish_field;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
	
}
