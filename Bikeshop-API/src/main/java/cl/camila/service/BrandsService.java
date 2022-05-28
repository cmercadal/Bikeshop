package cl.camila.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import cl.camila.model.Brands;

@Service
public interface BrandsService {
	
	public List<Brands> findAll();
	
	public Optional<Brands> findById(Integer brandId);

}
