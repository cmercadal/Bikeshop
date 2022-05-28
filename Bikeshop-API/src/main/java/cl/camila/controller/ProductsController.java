package cl.camila.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import cl.camila.model.Products;
import cl.camila.service.ProductsService;

@RestController
@RequestMapping("/api/v1/products")
public class ProductsController {

	@Autowired
	ProductsService productsService;
	
	@GetMapping
	@ResponseStatus(HttpStatus.OK)
	public List<Products> findAll(){
		return productsService.findAll();
	}
	
}
