package com.example.demo.entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Contrat implements Serializable{
	
	 @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    private Long id_contrat;
	    private Date dateCreation;
	    private Date Dateexperation;
	    private String objectif;
	    
	    @JsonBackReference
	    @OneToOne
	    @JoinColumn(name = "id_abonne")
	    private Abonne abonne;
	    
	    @JsonIgnore
		@ManyToOne
		@JoinColumn(name="id_bo", nullable=false)//colonne de contrat
		private Bo bo;
	   
	    
		public Contrat() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Contrat(Long id_contrat, Date dateCreation, Date dateexperation, String objectif) {
			super();
			this.id_contrat = id_contrat;
			this.dateCreation = dateCreation;
			Dateexperation = dateexperation;
			this.objectif = objectif;
		}
		public Long getId_contrat() {
			return id_contrat;
		}
		public void setId_contrat(Long id_contrat) {
			this.id_contrat = id_contrat;
		}
		public Date getDateCreation() {
			return dateCreation;
		}
		public void setDateCreation(Date dateCreation) {
			this.dateCreation = dateCreation;
		}
		public Date getDateexperation() {
			return Dateexperation;
		}
		public void setDateexperation(Date dateexperation) {
			Dateexperation = dateexperation;
		}
		public String getObjectif() {
			return objectif;
		}
		public void setObjectif(String objectif) {
			this.objectif = objectif;
		}
		@Override
		public String toString() {
			return "Contrat [id_contrat=" + id_contrat + ", dateCreation=" + dateCreation + ", Dateexperation="
					+ Dateexperation + ", objectif=" + objectif + "]";
		}
	    
	    
	

}
