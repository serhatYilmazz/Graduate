package com.ybu.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "languages")
public class Language {
	
	@Id
	@SequenceGenerator(name = "lang_seq", sequenceName = "lang_seq")
	@GeneratedValue(generator = "lang_seq", strategy=GenerationType.SEQUENCE)
	@Column(name = "languages_id")
	private int languageID;
	
	@Column(name = "languages_name")
	private String languageName;
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "pk.language")
	private Set<StudentLanguage> studentLanguage = new HashSet<>();
	
	public int getLanguageID() {
		return languageID;
	}

	public void setLanguageID(int languageID) {
		this.languageID = languageID;
	}

	public String getLanguageName() {
		return languageName;
	}

	public void setLanguageName(String languageName) {
		this.languageName = languageName;
	}

	public Set<StudentLanguage> getStudentLanguage() {
		return studentLanguage;
	}

	public void setStudentLanguage(Set<StudentLanguage> studentLanguage) {
		this.studentLanguage = studentLanguage;
	}
	
}
