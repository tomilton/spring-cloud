package com.formacionbdi.springboot.app.item.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.formacionbdi.springboot.app.item.clientes.CountriesClienteRest;

@Service("countrieFeign")
public class CountrieFeignImpl implements CountrieService {

	@Autowired
	private CountriesClienteRest countrieFeign;

	@Override
	public List<Object> getCountries() {
		return countrieFeign.getCountries();
	}

}
