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
@Table(name = "skills")
@AssociationOverrides({
	@AssociationOverride(name = "pk.student", joinColumns = @JoinColumn(name = "student_e_mail"))
})
public class Skills {

	@Embeddable
	public static class SkillsPk implements Serializable {

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
	private SkillsPk pk = new SkillsPk();
	
	@Column(name = "skill")
	private String skill;
	
	@Column(name = "status")
	private boolean status;

	public SkillsPk getPk() {
		return pk;
	}

	public void setPk(SkillsPk pk) {
		this.pk = pk;
	}

	public String getSkill() {
		return skill;
	}

	public void setSkill(String skill) {
		this.skill = skill;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
	
}
