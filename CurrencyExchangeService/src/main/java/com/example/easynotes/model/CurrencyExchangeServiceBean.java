package com.example.easynotes.model;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@EntityListeners(AuditingEntityListener.class)
@Table(name = "CurrencyExchange")
public class CurrencyExchangeServiceBean {

	@Id
	@GeneratedValue
	private int conversionid;

	private String fromCurrency;
	private String toCurrency;
	private BigDecimal coversionMultiple;

	public CurrencyExchangeServiceBean(int conversionid, String fromCurrency, String toCurrency,
			BigDecimal coversionMultiple) {
		super();
		this.conversionid = conversionid;
		this.fromCurrency = fromCurrency;
		this.toCurrency = toCurrency;
		this.coversionMultiple = coversionMultiple;
	}

	public String getFromCurrency() {
		return fromCurrency;
	}

	public void setFromCurrency(String fromCurrency) {
		this.fromCurrency = fromCurrency;
	}

	public String getToCurrency() {
		return toCurrency;
	}

	public void setToCurrency(String toCurrency) {
		this.toCurrency = toCurrency;
	}

	public int getConversionid() {
		return conversionid;
	}

	public void setConversionid(int conversionid) {
		this.conversionid = conversionid;
	}

	public BigDecimal getCoversionMultiple() {
		return coversionMultiple;
	}

	public void setCoversionMultiple(BigDecimal coversionMultiple) {
		this.coversionMultiple = coversionMultiple;
	}

	public CurrencyExchangeServiceBean() {

	}

	@Override
	public String toString() {
		return "CurrencyExchangeServiceBean [conversionid=" + conversionid + ", fromCurrency=" + fromCurrency
				+ ", toCurrency=" + toCurrency + ", coversionMultiple=" + coversionMultiple + "]";
	}

}
