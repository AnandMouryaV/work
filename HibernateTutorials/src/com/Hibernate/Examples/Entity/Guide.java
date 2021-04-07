package com.Hibernate.Examples.Entity;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Guide {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int guideId;
	private String name;
	private BigDecimal salary;
	
	@OneToMany(mappedBy = "guide",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	private List<Student> students;
	
	
	
	
	public Guide() {
			}
	public int getGuideId() {
		return guideId;
	}
	public void setGuideId(int guideId) {
		this.guideId = guideId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	public BigDecimal getSalary() {
		return salary;
	}
	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}
	
	
	
	public List<Student> getStudents() {
		return students;
	}
	public void setStudents(List<Student> students) {
		this.students = students;
	}
	public Guide(int guideId, String name,BigDecimal salary) {
		super();
		this.guideId = guideId;
		this.name = name;
		this.salary=salary;
	}
	@Override
	public String toString() {
		return "Guide [guideId=" + guideId + ", name=" + name + ", salary=" + salary + "]";
	}
	

}
