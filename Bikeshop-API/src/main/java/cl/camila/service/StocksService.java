package cl.camila.service;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import cl.camila.model.Stocks;

@Service
public interface StocksService{
	
	List<Stocks> findAll();
	
	List<Stocks> findAllByStoreId(Integer storeId);
	
	List<Stocks> findByProductId(Integer productId);

}
