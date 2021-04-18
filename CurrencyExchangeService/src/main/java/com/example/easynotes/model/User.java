package com.example.easynotes.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@EntityListeners(AuditingEntityListener.class)
@Table(name="User")
public class User {
	@Id
	@GeneratedValue(strategy =  GenerationType.AUTO)
	
	private int id;
	private String name;
	private Date dateofBirth;
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
	public Date getDateofBirth() {
		return dateofBirth;
	}
	public void setDateofBirth(Date dateofBirth) {
		this.dateofBirth = dateofBirth;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", dateofBirth=" + dateofBirth + "]";
	}
	public User(int id, String name, Date dateofBirth) {
		super();
		this.id = id;
		this.name = name;
		this.dateofBirth = dateofBirth;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	

}
