package com.example.CurrencyConversionService.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.CurrencyConversionService.Bean.CurrencyConversionBean;

@Repository
public interface currencyConversionRepository extends JpaRepository<CurrencyConversionBean, Long> {

	CurrencyConversionBean findByFromAndTo(String from_currency, String to_currency);

}