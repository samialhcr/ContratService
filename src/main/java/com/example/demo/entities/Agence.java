package com.example.demo.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Agence implements Serializable{
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
    private String name;
    private String city;
    private String address;
    
    @OneToMany(mappedBy="agence",fetch=FetchType.LAZY)
    private List<Bo> bo;
    
    
	public Agence() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Agence(Long id, String name, String city, String address) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.address = address;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	@Override
	public String toString() {
		return "Agence [id=" + id + ", name=" + name + ", city=" + city + ", address=" + address + "]";
	}
    
    

}
