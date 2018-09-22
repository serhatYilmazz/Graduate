package com.ybu.entity;

import java.io.Serializable;
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

@Entity
@Table(name = "lecturers")
@AssociationOverrides({
	@AssociationOverride(name = "pk.user", joinColumns = @JoinColumn(name = "lecturer_e_mail"))
})
public class Lecturer {
	
	@Embeddable
	public static class LecturerPk implements Serializable{
		
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
	private LecturerPk pk = new LecturerPk();
	
	@Column(name = "degree")
	private String degree;
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "pk.lecturer")
	private Set<Reference> reference = new HashSet<>();

	public LecturerPk getPk() {
		return pk;
	}

	public void setPk(LecturerPk pk) {
		this.pk = pk;
	}

	public String getDegree() {
		return degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}
	
}
