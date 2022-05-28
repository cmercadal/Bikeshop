package cl.camila.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import cl.camila.model.Brands;
import cl.camila.service.BrandsService;

@RestController
@RequestMapping("/api/v1/brands")
public class BrandsController {
	
	@Autowired
	BrandsService brandsService;
	
	@GetMapping
	@ResponseStatus(HttpStatus.OK)
	public List<Brands> findAll(){
		return brandsService.findAll();
	}
	
	@GetMapping("/{id}")
	@ResponseStatus(HttpStatus.OK)
	public Optional<Brands> findStoreById(@PathVariable Integer id) {
		return brandsService.findById(id);
	}
	

}
