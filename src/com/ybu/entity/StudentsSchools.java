package com.ybu.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.AssociationOverride;
import javax.persistence.AssociationOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "students_schools")
@AssociationOverrides({
	@AssociationOverride(joinColumns = @JoinColumn(name = "student_e_mail"), name = "pk.student"),
	@AssociationOverride(joinColumns = @JoinColumn(name = "school_id"), name = "pk.school")
})
public class StudentsSchools {

	public static class StudentsSchoolsPk implements Serializable{

		private static final long serialVersionUID = 1L;
		
		@ManyToOne
		private Student student;
		
		@ManyToOne
		private School school;

		public Student getStudent() {
			return student;
		}

		public void setStudent(Student student) {
			this.student = student;
		}

		public School getSchool() {
			return school;
		}

		public void setSchool(School school) {
			this.school = school;
		}
		
	}
	
	@EmbeddedId
	private StudentsSchoolsPk pk = new StudentsSchoolsPk();
	
	@Column(name = "start_date")
	private Date start_date;
	
	@Column(name = "end_date")
	private Date end_date;
	
	@Column(name = "gpa")
	private double gpa;
	
	@Column(name = "program")
	private String program;

	public StudentsSchoolsPk getPk() {
		return pk;
	}

	public void setPk(StudentsSchoolsPk pk) {
		this.pk = pk;
	}

	public Date getStart_at() {
		return start_date;
	}
	
	public Date getStart_date() {
		return start_date;
	}

	public void setStart_date(Date start_date) {
		this.start_date = start_date;
	}

	public Date getEnd_date() {
		return end_date;
	}

	public void setEnd_date(Date end_date) {
		this.end_date = end_date;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	public String getProgram() {
		return program;
	}

	public void setProgram(String program) {
		this.program = program;
	}
	
}
