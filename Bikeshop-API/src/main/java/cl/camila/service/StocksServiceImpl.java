package cl.camila.service;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;
import org.springframework.stereotype.Service;

import cl.camila.model.Stocks;
import cl.camila.repository.StocksRepository;

@Service
public class StocksServiceImpl implements StocksService {
	
	@Autowired
	StocksRepository stocksRepo;

	@Override
	public List<Stocks> findAllByStoreId(Integer storeId) {
		return stocksRepo.findAllByStoreId(storeId);
	}

	@Override
	public List<Stocks> findAll() {
		return stocksRepo.findAll();
	}

	@Override
	public List<Stocks> findByProductId(Integer productId) {
		return stocksRepo.findByProductId(productId);
	}
	
	

	

}
