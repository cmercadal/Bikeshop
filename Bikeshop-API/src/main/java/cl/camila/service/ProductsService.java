package cl.camila.service;

import java.util.List;

import org.springframework.stereotype.Service;

import cl.camila.model.Products;

@Service
public interface ProductsService {
	
	public List<Products> findAll();

}
