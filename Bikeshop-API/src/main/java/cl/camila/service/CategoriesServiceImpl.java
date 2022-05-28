package cl.camila.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.camila.model.Categories;
import cl.camila.repository.CategoriesRepository;

@Service
public class CategoriesServiceImpl implements CategoriesService {

	@Autowired
	CategoriesRepository categoriesRepo;
	
	@Override
	public List<Categories> findAll() {
		
		return categoriesRepo.findAll();
	}

	@Override
	public Optional<Categories> findById(Integer categoryId) {
		
		return categoriesRepo.findById(categoryId);
	}

}
