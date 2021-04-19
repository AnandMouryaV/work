package com.example.CurrencyConversionService.Controller;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.CurrencyConversionService.CurrencyExchangeServiceProxy;
import com.example.CurrencyConversionService.Bean.CurrencyConversionBean;

@RestController
public class CurrencyConversionController {

	@Autowired
	CurrencyExchangeServiceProxy proxy;

	@GetMapping("/api/currenyConversion/{from}/to/{to}/quantity/{quantity}")

	public CurrencyConversionBean getcurrnecyConversion(@PathVariable String from, @PathVariable String to,
			@PathVariable BigDecimal quantity) {

		Map<String, String> uriVariables = new HashMap<String, String>();

		uriVariables.put("from", from);
		uriVariables.put("to", to);

		System.out.println(uriVariables.toString());

		ResponseEntity<CurrencyConversionBean> responseEntity = new RestTemplate().getForEntity(
				"http://localhost:8888/api/currencyExchange/{from}/to/{to}", CurrencyConversionBean.class,
				uriVariables);

		CurrencyConversionBean response = responseEntity.getBody();
		System.out.println("the values is :" + response.getCurrencyId());
		return new CurrencyConversionBean(response.getCurrencyId(), from, to, response.getConversionMultiple(),
				quantity, quantity.multiply(response.getConversionMultiple()));

	}

	@GetMapping("/api/currenyConversion-feign/{from}/to/{to}/quantity/{quantity}")

	public CurrencyConversionBean getcurrnecyConversionFeign(@PathVariable("from") String from,
			@PathVariable("to") String to, @PathVariable BigDecimal quantity) {

		CurrencyConversionBean response = proxy.getcurrencyExchange(from, to);
		System.out.println("the values is :" + response.getCurrencyId());
		return new CurrencyConversionBean(response.getCurrencyId(), from, to, response.getConversionMultiple(),
				quantity, quantity.multiply(response.getConversionMultiple()));

	}
}
