package com.formacionbdi.springboot.app.item.clientes;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "api-service", url = "https://restcountries.eu/")
public interface CountriesClienteRest {

	@GetMapping("/rest/v2/all")
	public List<Object> getCountries();

}
