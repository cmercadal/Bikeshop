package cl.camila.services;

import java.util.List;

import cl.camila.dto.StoresDTO;

public interface StoresService {
	
	List<StoresDTO> findAll();
	StoresDTO findById(Integer id);

}
