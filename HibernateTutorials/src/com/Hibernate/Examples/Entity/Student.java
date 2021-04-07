package com.Hibernate.Examples.Entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int studentEnrollmentNumber;
	private String name;
	private Date dateOfBirth;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "guideId")
	private Guide guide;
	public Student(int studentEnrollmentNumber, String name, Date dateOfBirth, Guide guide) {
		super();
		//StudentEnrollmentNumber = studentEnrollmentNumber;
		this.name = name;
		this.dateOfBirth = dateOfBirth;
		this.guide = guide;
	}
	@Override
	public String toString() {
		return "Student [StudentEnrollmentNumber=" + studentEnrollmentNumber + ", name=" + name + ", dateOfBirth="
				+ dateOfBirth + ", guide=" + guide + "]";
	}
	public int getStudentEnrollmentNumber() {
		return studentEnrollmentNumber;
	}
	public void setStudentEnrollmentNumber(int studentEnrollmentNumber) {
		this.studentEnrollmentNumber = studentEnrollmentNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public Guide getGuide() {
		return guide;
	}
	public void setGuide(Guide guide) {
		this.guide = guide;
	}
	public Student() {
		}
	
	
	

}
