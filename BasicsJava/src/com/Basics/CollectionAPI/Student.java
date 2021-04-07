package com.Basics.CollectionAPI;

import java.io.Serializable;
import java.util.Comparator;
import java.util.Date;

public class Student implements Comparator<Student>,Serializable {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private String name;
	private Date dob;
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
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}

	/*
	 * @Override public int compareTo(Student o) { // TODO Auto-generated method
	 * stub return this.getDob().compareTo(o.getDob()); }
	 */
	public Student(int id, String name, Date dob) {
		super();
		this.id = id;
		this.name = name;
		this.dob = dob;
	}
	public Student() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", dob=" + dob + "]";
	}
	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return o1.getDob().compareTo(o2.getDob());
	}
	
	
	

}
