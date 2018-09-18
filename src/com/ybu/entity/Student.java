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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "students")
@AssociationOverrides({
	@AssociationOverride(name = "pk.user", joinColumns = @JoinColumn(name = "student_e_mail"))
})
public class Student {
	
	@Embeddable
	public static class StudentPk implements Serializable{
		
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		@ManyToOne
		private User user;

		public User getUser() {
			return user;
		}

		public void setUser(User user) {
			this.user = user;
		}
		
	}
	
	@EmbeddedId
	private StudentPk pk = new StudentPk();
	
	@Temporal(TemporalType.DATE)
	@Column(name = "birth_date")
	private Date birthDate;
	
	@Column(name = "e_mail2")
	private String eMail2;
	
	@Column(name = "website")
	private String website;
	
	@Column(name = "target")
	private String target;
	
	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public String geteMail2() {
		return eMail2;
	}

	public void seteMail2(String eMail2) {
		this.eMail2 = eMail2;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public String getTarget() {
		return target;
	}

	public void setTarget(String target) {
		this.target = target;
	}

	public StudentPk getPk() {
		return pk;
	}

	public void setPk(StudentPk pk) {
		this.pk = pk;
	}
	
	
//	@Transient
//	public int getUser_id() {
//		return getPk().getUser().getUser_id();
//	}
//
//	public void setUser_id(int user_id) {
//		getPk().getUser().setUser_id(user_id);
//	}
//
//	@Transient
//	public String getName() {
//		return getPk().getUser().getName();
//	}
//
//	public void setName(String name) {
//		getPk().getUser().setName(name);
//	}
//
//	@Transient
//	public String getSurname() {
//		return getPk().getUser().getSurname();
//	}
//
//	public void setSurname(String surname) {
//		getPk().getUser().setSurname(surname);
//	}
//
//	@Transient
//	public String geteMail() {
//		return getPk().getUser().geteMail();
//	}
//
//	public void seteMail(String eMail) {
//		getPk().getUser().seteMail(eMail);
//	}
//
//	@Transient
//	public String getPassword() {
//		return getPk().getUser().getPassword();
//	}
//
//	public void setPassword(String password) {
//		getPk().getUser().setPassword(password);
//	}
//
//	@Transient
//	public String getPhone() {
//		return getPk().getUser().getPhone();
//	}
//
//	public void setPhone(String phone) {
//		getPk().getUser().setPhone(phone);
//	}
//
//	@Transient
//	public char getRole() {
//		return getPk().getUser().getRole();
//	}
//
//	public void setRole(char role) {
//		getPk().getUser().setRole(role);
//	}
	
}
