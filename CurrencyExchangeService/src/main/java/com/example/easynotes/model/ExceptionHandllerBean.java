package com.example.easynotes.model;

import java.util.Date;

public class ExceptionHandllerBean {
	
	private String errorMessage;
	private String errorDescription;
	private Date timestamp;
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public String getErrorDescription() {
		return errorDescription;
	}
	public void setErrorDescription(String errorDescription) {
		this.errorDescription = errorDescription;
	}
	public Date getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}
	public ExceptionHandllerBean(String errorMessage, String errorDescription, Date timestamp) {
		super();
		this.errorMessage = errorMessage;
		this.errorDescription = errorDescription;
		this.timestamp = timestamp;
	}
	public ExceptionHandllerBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
