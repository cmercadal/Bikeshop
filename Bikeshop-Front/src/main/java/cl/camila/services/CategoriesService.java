package cl.camila.services;

import java.util.List;

import cl.camila.dto.CategoryDTO;


public interface CategoriesService {
	
	List<CategoryDTO> findAll();
	CategoryDTO findById(Integer id);

}
