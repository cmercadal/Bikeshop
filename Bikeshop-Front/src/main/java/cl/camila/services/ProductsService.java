package cl.camila.services;

import java.util.List;

import cl.camila.dto.ProductsDTO;

public interface ProductsService {
	
	List<ProductsDTO> findAll();
	ProductsDTO findById(Integer id);
	


}
