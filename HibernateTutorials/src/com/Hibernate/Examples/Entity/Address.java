package com.Hibernate.Examples.Entity;

import javax.persistence.Embeddable;

@Embeddable
public class Address {
	
	private String Street;
	private String city;
	private String zipcode;
	
	public String getStreet() {
		return Street;
	}
	public void setStreet(String street) {
		Street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	public Address() {
		
	}
	public Address(String street, String city, String zipcode) {
		
		Street = street;
		this.city = city;
		this.zipcode = zipcode;
	}
	@Override
	public String toString() {
		return "Address [Street=" + Street + ", city=" + city + ", zipcode=" + zipcode + "]";
	}

	
	
}
