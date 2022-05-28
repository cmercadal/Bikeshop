package cl.camila.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import cl.camila.model.Products;
import cl.camila.repository.ProductsRepository;

@Service
public class ProductsServiceImpl implements ProductsService {

	
	@Autowired
	ProductsRepository productsRepo;
	
	@Override
	public List<Products> findAll() {
		// TODO Auto-generated method stub
		return productsRepo.findAll();
	}


			
	

}
