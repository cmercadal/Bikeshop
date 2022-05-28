package cl.camila.services;

import java.util.List;

import cl.camila.dto.StocksDTO;


public interface StocksService {
	
	List<StocksDTO> findAll();
	public List<StocksDTO> findAByProductId(Integer productId);

}
