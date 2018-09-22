package com.ybu.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.AssociationOverride;
import javax.persistence.AssociationOverrides;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
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
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "pk.student")
	private Set<StudentsJobs> studentsJobs = new HashSet<StudentsJobs>();
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "pk.student")
	private Set<StudentsSchools> studentsSchools = new HashSet<>();
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "pk.student")
	private Set<SocialMediaAccount> socialMediaAccounts = new HashSet<>(0);
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "pk.student")
	private Set<Interest> interest = new HashSet<>();
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "pk.student")
	private Set<Certificates> certificates = new HashSet<>();
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "pk.student")
	private Set<AcademicPublish> academicPublish = new HashSet<>();
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "pk.student")
	private Set<Reference> reference = new HashSet<>();
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "pk.student")
	private Set<Awards> awards = new HashSet<>();
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "pk.student")
	private Set<Skills> skill = new HashSet<>();
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "pk.student")
	private Set<StudentLanguage> studentLanguage = new HashSet<>();
	
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

	public Set<StudentsJobs> getStudentsJobs() {
		return studentsJobs;
	}

	public void setStudentsJobs(Set<StudentsJobs> studentsJobs) {
		this.studentsJobs = studentsJobs;
	}

	public Set<StudentsSchools> getStudentsSchools() {
		return studentsSchools;
	}

	public void setStudentsSchools(Set<StudentsSchools> studentsSchools) {
		this.studentsSchools = studentsSchools;
	}

	public Set<SocialMediaAccount> getSocialMediaAccounts() {
		return socialMediaAccounts;
	}

	public void setSocialMediaAccounts(Set<SocialMediaAccount> socialMediaAccounts) {
		this.socialMediaAccounts = socialMediaAccounts;
	}

	public Set<Interest> getInterest() {
		return interest;
	}

	public void setInterest(Set<Interest> interest) {
		this.interest = interest;
	}

	public Set<Certificates> getCertificates() {
		return certificates;
	}

	public void setCertificates(Set<Certificates> certificates) {
		this.certificates = certificates;
	}

	public Set<AcademicPublish> getAcademicPublish() {
		return academicPublish;
	}

	public void setAcademicPublish(Set<AcademicPublish> academicPublish) {
		this.academicPublish = academicPublish;
	}

	public Set<Reference> getReference() {
		return reference;
	}

	public void setReference(Set<Reference> reference) {
		this.reference = reference;
	}

	public Set<Awards> getAwards() {
		return awards;
	}

	public void setAwards(Set<Awards> awards) {
		this.awards = awards;
	}

	public Set<Skills> getSkill() {
		return skill;
	}

	public void setSkill(Set<Skills> skill) {
		this.skill = skill;
	}

	public Set<StudentLanguage> getStudentLanguage() {
		return studentLanguage;
	}

	public void setStudentLanguage(Set<StudentLanguage> studentLanguage) {
		this.studentLanguage = studentLanguage;
	}
}
