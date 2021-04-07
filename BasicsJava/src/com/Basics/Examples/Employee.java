package com.Basics.Examples;

public class Employee {
	
	private  int employeeeId;
	private String name;
	private String contact;
	private Address address;
	
	Employee() {
		System.out.println("this  is a no arg constructor");
	}

	public int getEmployeeeId() {
		return employeeeId;
	}

	public void setEmployeeeId(int employeeeId) {
		this.employeeeId = employeeeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Employee(int employeeeId, String name, String contact, Address address) {
		super();
		this.employeeeId = employeeeId;
		this.name = name;
		this.contact = contact;
		this.address = address;
	}
	
	

}
