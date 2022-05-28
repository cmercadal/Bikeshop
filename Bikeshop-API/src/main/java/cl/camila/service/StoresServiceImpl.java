package cl.camila.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.camila.model.Stocks;
import cl.camila.model.Stores;
import cl.camila.repository.StoresRepository;

@Service
public class StoresServiceImpl implements StoresService {

	@Autowired
	StoresRepository storesRepo;
	
	@Override
	public List<Stores> findAll() {
		
		return storesRepo.findAll();
	}

	@Override
	public Optional<Stores> findById(Integer storeId) {
		
		return storesRepo.findById(storeId);
	}

}
