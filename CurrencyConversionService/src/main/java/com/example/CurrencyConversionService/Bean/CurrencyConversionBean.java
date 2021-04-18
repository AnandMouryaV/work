package com.example.CurrencyConversionService.Bean;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class CurrencyConversionBean {
	
	@Id
	@GeneratedValue
	private long currencyId;
	
	private String from;
	private String to;
	private BigDecimal conversionMultiple;
	public CurrencyConversionBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CurrencyConversionBean(long currencyId, String fromCurrency, String toCurrency,
			BigDecimal conversionMultiple) {
		super();
		this.currencyId = currencyId;
		this.from = fromCurrency;
		this.to = toCurrency;
		this.conversionMultiple = conversionMultiple;
	}
	public long getCurrencyId() {
		return currencyId;
	}
	public void setCurrencyId(long currencyId) {
		this.currencyId = currencyId;
	}
	public String getFromCurrency() {
		return from;
	}
	public void setFromCurrency(String fromCurrency) {
		this.from = fromCurrency;
	}
	public String getToCurrency() {
		return to;
	}
	public void setToCurrency(String toCurrency) {
		this.to = toCurrency;
	}
	public BigDecimal getConversionMultiple() {
		return conversionMultiple;
	}
	public void setConversionMultiple(BigDecimal conversionMultiple) {
		this.conversionMultiple = conversionMultiple;
	}
	
	
	

}
