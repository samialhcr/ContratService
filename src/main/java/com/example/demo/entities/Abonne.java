package com.example.demo.entities;

import java.io.Serializable;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@PrimaryKeyJoinColumn(name = "id")
public class Abonne extends Utilisateurs implements Serializable{
	
	    private String  cin;
	    private String  firstName;
	    private String lastName;
	    private String  address;
	    private  String phone;
	    private  Boolean isActiveted;
	    
	    @JsonBackReference
	    @OneToMany(mappedBy = "abonne",fetch = FetchType.LAZY)
	    private List<Compte> comptes;
	    
	    @JsonManagedReference
	    @OneToOne
	    @JoinColumn(name = "id_contrat")
	    private Contrat contrat;
	    
		@ManyToMany(fetch = FetchType.LAZY,
	            cascade = {
	                CascadeType.PERSIST,
	                CascadeType.MERGE})
		@JoinTable(
				  name = "gestionOffre", 
				  joinColumns = @JoinColumn(name = "id"), 
				  inverseJoinColumns = @JoinColumn(name = "id_Offre"))
		private Set<Offre> tags = new HashSet<>();
		
	    
		public Abonne() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Abonne(long id, String email, String username, String password) {
			super(id, email, username, password);
			// TODO Auto-generated constructor stub
		}
		public Abonne(String cin, String firstName, String lastName, String address, String phone,
				Boolean isActiveted) {
			super();
			this.cin = cin;
			this.firstName = firstName;
			this.lastName = lastName;
			this.address = address;
			this.phone = phone;
			this.isActiveted = isActiveted;
		}
		public String getCin() {
			return cin;
		}
		public void setCin(String cin) {
			this.cin = cin;
		}
		public String getFirstName() {
			return firstName;
		}
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		public String getLastName() {
			return lastName;
		}
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public String getPhone() {
			return phone;
		}
		public void setPhone(String phone) {
			this.phone = phone;
		}
		public Boolean getIsActiveted() {
			return isActiveted;
		}
		public void setIsActiveted(Boolean isActiveted) {
			this.isActiveted = isActiveted;
		}
		@Override
		public String toString() {
			return "Abonne [cin=" + cin + ", firstName=" + firstName + ", lastName=" + lastName + ", address=" + address
					+ ", phone=" + phone + ", isActiveted=" + isActiveted + "]";
		}
	    
	    


}
