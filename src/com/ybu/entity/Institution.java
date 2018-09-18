package com.ybu.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "institutions")
public class Institution {
	
	@Id
	@Column(name = "institution_e_mail")
	private String institutionEMail;
	
	@Column(name = "institution_name")
	private String institutionName;
	
	@Column(name = "institution_password")
	private String institutionPassword;

	public String getInstitutionEMail() {
		return institutionEMail;
	}

	public void setInstitutionEMail(String institutionEMail) {
		this.institutionEMail = institutionEMail;
	}

	public String getInstitutionName() {
		return institutionName;
	}

	public void setInstitutionName(String institutionName) {
		this.institutionName = institutionName;
	}

	public String getInstitutionPassword() {
		return institutionPassword;
	}

	public void setInstitutionPassword(String institutionPassword) {
		this.institutionPassword = institutionPassword;
	}
	
}
