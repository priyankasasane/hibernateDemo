package com.hibernate.onetomany;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Address {
	@Id
	private int pin;
	private String City;
	
	public Address() {
		super();
	}
	public Address(int pin, String city) {
		super();
		this.pin = pin;
		this.City = city;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		this.City = city;
	}
	@Override
	public String toString() {
		return "Address [pin=" + pin + ", City=" + City + "]";
	}
	
	

}
