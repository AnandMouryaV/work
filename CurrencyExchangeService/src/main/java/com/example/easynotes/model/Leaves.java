package com.example.easynotes.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import javax.persistence.Table;

@Entity
@Table(name = "Leaves")
public class Leaves {

	@Id
	@GeneratedValue
	private int leaveId;
	private String leaveType;
	private Date fromDate;
	private Date toDate;
	

	public int getLeaveId() {
		return leaveId;
	}
	public void setLeaveId(int leaveId) {
		this.leaveId = leaveId;
	}
	public String getLeaveType() {
		return leaveType;
	}
	public void setLeaveType(String leaveType) {
		this.leaveType = leaveType;
	}
	public Date getFromDate() {
		return fromDate;
	}
	public void setFromDate(Date fromDate) {
		this.fromDate = fromDate;
	}
	public Date getToDate() {
		return toDate;
	}
	public void setToDate(Date toDate) {
		this.toDate = toDate;
	}
	
	public Leaves() {
		
	}

	
	public Leaves(int leaveId, String leaveType, Date fromDate, Date toDate) {
		super();
		this.leaveId = leaveId;
		this.leaveType = leaveType;
		this.fromDate = fromDate;
		this.toDate = toDate;
		
	}
	
	

}
