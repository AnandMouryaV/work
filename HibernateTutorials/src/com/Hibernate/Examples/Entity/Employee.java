package com.Hibernate.Examples.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee {
	
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	private int id;
	private String name;
	@Enumerated(EnumType.STRING)
	@Column(name="employee_status")
	private EmployeeEnum emplEnum;
	public Employee(int id, String name, EmployeeEnum emplEnum) {
		
		//this.id = id;
		this.name = name;
		this.emplEnum = emplEnum;
	}
	public Employee() {
		}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", emplEnum=" + emplEnum + "]";
	}
	

}
