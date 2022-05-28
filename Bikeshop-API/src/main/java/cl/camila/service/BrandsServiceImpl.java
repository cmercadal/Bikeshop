package cl.camila.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.camila.model.Brands;
import cl.camila.repository.BrandsRepository;

@Service
public class BrandsServiceImpl implements BrandsService {

	@Autowired
	BrandsRepository brandsRepo;
	
	
	@Override
	public List<Brands> findAll() {
		
		return brandsRepo.findAll();
	}

	@Override
	public Optional<Brands> findById(Integer brandId) {
		
		return brandsRepo.findById(brandId);
	}

}
