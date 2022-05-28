package cl.camila.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import cl.camila.model.Categories;

@Service
public interface CategoriesService {
	
	public List<Categories> findAll();
	
	public Optional<Categories> findById(Integer categoryId);
 
}
