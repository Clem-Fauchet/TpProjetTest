package com.tactfactory.monprojetsb.monprojetsb;

import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "user")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Long id;

	public String firstname;
	public String lastname;

	@OneToMany
	private List<Product> listProduit;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public List<Product> getListProduit() {
		return listProduit;
	}

	public void setListProduit(List<Product> listProduit) {
		this.listProduit = listProduit;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", listProduit=" + listProduit
				+ "]";
	}
}
