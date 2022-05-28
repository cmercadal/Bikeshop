package cl.camila.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import cl.camila.model.Stores;

@Service
public interface StoresService {
	
	public List<Stores> findAll();
	public Optional<Stores> findById(Integer storeId);


}
