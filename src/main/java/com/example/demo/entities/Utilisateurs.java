package com.example.demo.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Utilisateurs implements Serializable{
	    @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    private Long id ;
	    private String Email ;
	    private String username;
	    private String password;

	    public long getId() {
	        return id;
	    }
	    public void setId(long id) {
	        this.id = id;
	    }
	    public String getEmail() {
	        return Email;
	    }
	    public void setEmail(String email) {
	        Email = email;
	    }
	    public String getUsername() {
	        return username;
	    }
	    public void setUsername(String username) {
	        this.username = username;
	    }
	    public String getPassword() {
	        return password;
	    }
	    public void setPassword(String password) {
	        this.password = password;
	    }

	    public Utilisateurs() {
	        super();
	        // TODO Auto-generated constructor stub
	    }
	    public Utilisateurs(long id, String email,String username, String password) {
	        super();
	        this.id = id;
	        Email = email;
	        this.username = username;
	        this.password = password;
	    }
		@Override
		public String toString() {
			return "Utilisateurs [id=" + id + ", Email=" + Email + ", username=" + username + ", password=" + password
					+ "]";
		}
	    
	    

}
