package com.example.easynotes.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.easynotes.exception.CurrencyExchangenotfound;
import com.example.easynotes.model.CurrencyExchangeServiceBean;
import com.example.easynotes.repository.CurrencyExchangeDao;
import com.example.easynotes.repository.CurrencyExchangeRepository;

@RestController
public class CurrencyExchangeController {

	
	  @Autowired CurrencyExchangeRepository currencyExchage;
	 
	@Autowired
	CurrencyExchangeDao currencyExchangeDao;

	@GetMapping("/api/currencyExchange/{from}/to/{to}")
	public CurrencyExchangeServiceBean getcurrencyExchange(@PathVariable String from, @PathVariable String to) {

		CurrencyExchangeServiceBean c = currencyExchage.findByFromCurrencyAndToCurrency(from, to);
		if (c == null) {
			throw new CurrencyExchangenotfound("no exchage found");
		}

		return c;

	}

	@PostMapping("/api/currencyExchange")
	public void addcurrencytotheExchange(@RequestBody CurrencyExchangeServiceBean currencyExchangebean) {

		currencyExchangeDao.addtotheExchange(currencyExchangebean);

	}
	@GetMapping("/api/currencyExchanges")
	public List<CurrencyExchangeServiceBean> getallcurrencyExchange() {

		
		return currencyExchage.findAll();

	}

}
