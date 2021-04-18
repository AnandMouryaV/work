package com.example.easynotes.repository;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.easynotes.model.CurrencyExchangeServiceBean;

@Service
public class CurrencyExchangeDao {
	
	private static List<CurrencyExchangeServiceBean> currencyList =new ArrayList<CurrencyExchangeServiceBean>();
	
	static {
		currencyList.add(new CurrencyExchangeServiceBean(1001,"USD","INR",new BigDecimal(72.5)));
		currencyList.add(new CurrencyExchangeServiceBean(1002,"EUR","INR",new BigDecimal(92.5)));
		currencyList.add(new CurrencyExchangeServiceBean(1003 ,"SAR","INR",new BigDecimal(18.5)));
		currencyList.add(new CurrencyExchangeServiceBean(1004,"AUD","INR",new BigDecimal(55.5)));
	
	
	}
	
	public void addtotheExchange(CurrencyExchangeServiceBean ceb) {
		if(ceb!=null) {
			currencyList.add(ceb);
		}
	}
	
	public CurrencyExchangeServiceBean gettheExchange(String from,String to) {
	
		for(CurrencyExchangeServiceBean c:currencyList) {
			
			if(c.getFromCurrency().equalsIgnoreCase(from) && c.getToCurrency().equalsIgnoreCase(to)) {
				return c;
			}
			
		}
		return null;
	}

}
