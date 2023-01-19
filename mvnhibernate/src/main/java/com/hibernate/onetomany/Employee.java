package com.hibernate.onetomany;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Employee {//Entity class
	@Id
	private int id;
	private String name;
	
	@OneToMany
	private List<Address> adrLIst;
	
	public Employee() {
		super();
	}
	
	public Employee(int id, String name, List<Address> adr) {
		super();
		this.id = id;
		this.name = name;
		this.adrLIst = adr;
	}

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Address> getAdr() {
		return adrLIst;
	}

	public void setAdr(List<Address> adr) {
		this.adrLIst = adr;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", Adr=" + adrLIst + "]";
	}
	
	
	

}
