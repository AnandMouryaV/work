package com.example.CurrencyConversionService.Controller;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.CurrencyConversionService.Bean.CurrencyConversionBean;
import com.example.CurrencyConversionService.Repository.currencyConversionRepository;

@RestController
public class CurrencyConversionController {
	
	@Autowired currencyConversionRepository cr;
	
	
	@GetMapping("/api/currenyConversion/{from}/to/{to}")

	
	public CurrencyConversionBean getcurrnecyConversion(@PathVariable String from,@PathVariable String to) {
		
		
	
		return new CurrencyConversionBean(1234,from,to,new BigDecimal(44.5));
		
	}
}
