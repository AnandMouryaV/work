package com.example.CurrencyConversionService;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.client.RestTemplate;

import com.example.CurrencyConversionService.Bean.CurrencyConversionBean;




@FeignClient(name ="Currency-Exchange-Service",url="localhost:8888")
public interface CurrencyExchangeServiceProxy {
	
	
	@GetMapping("/api/currencyExchange/{from}/to/{to}")
	public CurrencyConversionBean getcurrencyExchange(@PathVariable String from, @PathVariable String to);
		
	

}
