package cl.camila.services;

import java.util.List;

import cl.camila.dto.BrandsDTO;

public interface BrandsService {
	
	List<BrandsDTO> findAll();
	BrandsDTO findById(Integer brandsId);

}
