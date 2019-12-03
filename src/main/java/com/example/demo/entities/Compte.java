package com.example.demo.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
public class Compte implements Serializable{
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_compte;
    private Date dateCreation;
    private double solde;
    
   
    
    @JsonManagedReference
    @ManyToOne
    @JoinColumn(name = "id_abonne")
    private Abonne abonne;
    
    @OneToOne
    @JoinColumn(name = "id_cartebancaire")
    private CarteBancaire carteBancaire;

    
	public Compte() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Compte(Long id_compte, Date dateCreation, double solde) {
		super();
		this.id_compte = id_compte;
		this.dateCreation = dateCreation;
		this.solde = solde;
	}
	public Long getId_compte() {
		return id_compte;
	}
	public void setId_compte(Long id_compte) {
		this.id_compte = id_compte;
	}
	public Date getDateCreation() {
		return dateCreation;
	}
	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}
	public double getSolde() {
		return solde;
	}
	public void setSolde(double solde) {
		this.solde = solde;
	}
	@Override
	public String toString() {
		return "Compte [id_compte=" + id_compte + ", dateCreation=" + dateCreation + ", solde=" + solde + "]";
	}
    
    
}
