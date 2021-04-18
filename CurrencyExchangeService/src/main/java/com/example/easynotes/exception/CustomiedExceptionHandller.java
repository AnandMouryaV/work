package com.example.easynotes.exception;


import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;



import com.example.easynotes.model.ExceptionHandllerBean;

@ControllerAdvice
@RestController
public class CustomiedExceptionHandller extends ResponseEntityExceptionHandler{
	
	@ExceptionHandler(EmployeeNotfoundException.class)
	public static final ResponseEntity<ExceptionHandllerBean> usernotfoundExceptionHandller(Exception ex,WebRequest req) {
		
		
		ExceptionHandllerBean e = new ExceptionHandllerBean(ex.getMessage(), req.getDescription(false), new Date());
		
		return new ResponseEntity<ExceptionHandllerBean>(e,HttpStatus.NOT_FOUND);
		
	}

	
	@ExceptionHandler(Exception.class)
	public static final ResponseEntity<ExceptionHandllerBean> ExceptionHandller(Exception ex,WebRequest req) {
		
		
		ExceptionHandllerBean e = new ExceptionHandllerBean(ex.getMessage(), req.getDescription(false), new Date());
		
		return new ResponseEntity<ExceptionHandllerBean>(e,HttpStatus.INTERNAL_SERVER_ERROR);
		
	}
}
