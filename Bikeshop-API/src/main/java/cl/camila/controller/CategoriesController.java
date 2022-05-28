package cl.camila.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import cl.camila.model.Categories;
import cl.camila.service.CategoriesService;

@RestController
@RequestMapping("/api/v1/categories")
public class CategoriesController {
	
	@Autowired
	CategoriesService cS;
	
	@GetMapping
	@ResponseStatus(HttpStatus.OK)
	public List<Categories> findAll(){
		return cS.findAll();
	}
	
	@GetMapping("/{id}")
	@ResponseStatus(HttpStatus.OK)
	public Optional<Categories> findById(Integer categoryId){
		return cS.findById(categoryId);
	}

}
