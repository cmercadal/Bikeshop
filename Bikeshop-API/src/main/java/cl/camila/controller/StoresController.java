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

import cl.camila.model.Stores;
import cl.camila.service.StoresService;

@RestController
@RequestMapping("/api/v1/stores")
public class StoresController {

	@Autowired
	StoresService storesService;
	
	@GetMapping("/{id}")
	@ResponseStatus(HttpStatus.OK)
	public Optional<Stores> findStoreById(@PathVariable Integer id) {
		return storesService.findById(id);
	}
	
	@GetMapping
	@ResponseStatus(HttpStatus.OK)
	public List<Stores> findAll(){
		return storesService.findAll();
	}
}
