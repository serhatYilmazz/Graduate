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
@Table(name = "students_languages")
@AssociationOverrides({
	@AssociationOverride(joinColumns = @JoinColumn(name = "student_e_mail"), name = "pk.student"),
	@AssociationOverride(joinColumns = @JoinColumn(name = "languages_id"), name = "pk.language")
})
public class StudentLanguage {
	
	@Embeddable
	public static class StudentLanguagePk implements Serializable{
		
		@ManyToOne
		private Student student;
		
		@ManyToOne
		private Language language;

		public Student getStudent() {
			return student;
		}

		public void setStudent(Student student) {
			this.student = student;
		}

		public Language getLanguage() {
			return language;
		}

		public void setLanguage(Language language) {
			this.language = language;
		}
	}
	
	@EmbeddedId
	private StudentLanguagePk pk = new StudentLanguagePk();
	
	@Column(name = "languages_level")
	private String languageLevel;

	public StudentLanguagePk getPk() {
		return pk;
	}

	public void setPk(StudentLanguagePk pk) {
		this.pk = pk;
	}

	public String getLanguageLevel() {
		return languageLevel;
	}

	public void setLanguageLevel(String languageLevel) {
		this.languageLevel = languageLevel;
	}
}
