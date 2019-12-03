package com.example.demo.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class CarteBancaire {
	
	 @Id
	    private Long id_carte;
	    private String pin ;
	    private Date dateExperation;
	    private double montant;
	    private boolean  Etat;
	    
	    @OneToOne
	    @JoinColumn(name = "id_compte")
	    private Compte compte;
	    
		public CarteBancaire() {
			super();
			// TODO Auto-generated constructor stub
		}
		public CarteBancaire(Long id_carte, String pin, Date dateExperation, double montant, boolean etat) {
			super();
			this.id_carte = id_carte;
			this.pin = pin;
			this.dateExperation = dateExperation;
			this.montant = montant;
			Etat = etat;
		}
		public Long getId_carte() {
			return id_carte;
		}
		public void setId_carte(Long id_carte) {
			this.id_carte = id_carte;
		}
		public String getPin() {
			return pin;
		}
		public void setPin(String pin) {
			this.pin = pin;
		}
		public Date getDateExperation() {
			return dateExperation;
		}
		public void setDateExperation(Date dateExperation) {
			this.dateExperation = dateExperation;
		}
		public double getMontant() {
			return montant;
		}
		public void setMontant(double montant) {
			this.montant = montant;
		}
		public boolean isEtat() {
			return Etat;
		}
		public void setEtat(boolean etat) {
			Etat = etat;
		}
		@Override
		public String toString() {
			return "CarteBancaire [id_carte=" + id_carte + ", pin=" + pin + ", dateExperation=" + dateExperation
					+ ", montant=" + montant + ", Etat=" + Etat + "]";
		}
	    
	    

}
