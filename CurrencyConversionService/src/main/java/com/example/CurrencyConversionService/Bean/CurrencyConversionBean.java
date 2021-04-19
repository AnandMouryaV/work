package com.example.CurrencyConversionService.Bean;

import java.math.BigDecimal;



public class CurrencyConversionBean {
	

	private long currencyId;
	
	private String from;
	private String to;
	private BigDecimal conversionMultiple;
	private BigDecimal quantity;
	private BigDecimal caluculatedAmount;
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
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public BigDecimal getQuantity() {
		return quantity;
	}
	public void setQuantity(BigDecimal quantity) {
		this.quantity = quantity;
	}
	public BigDecimal getCaluculatedAmount() {
		return caluculatedAmount;
	}
	public void setCaluculatedAmount(BigDecimal caluculatedAmount) {
		this.caluculatedAmount = caluculatedAmount;
	}
	public CurrencyConversionBean(long currencyId, String from, String to, BigDecimal conversionMultiple,
			BigDecimal quantity, BigDecimal caluculatedAmount) {

		this.currencyId = currencyId;
		this.from = from;
		this.to = to;
		this.conversionMultiple = conversionMultiple;
		this.quantity = quantity;
		this.caluculatedAmount = caluculatedAmount;
	}
	
	
	

}
