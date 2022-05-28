package cl.camila.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import cl.camila.model.Stocks;
import cl.camila.service.StocksService;

@RestController
@RequestMapping("/api/v1/stocks")
public class StocksController {
	

	@Autowired
	StocksService stocksService;
	
	@GetMapping("/store/{storeId}")
	@ResponseStatus(HttpStatus.OK)
	public List<Stocks> findAllByStoreId(@PathVariable Integer storeId){
		return stocksService.findAllByStoreId(storeId);
	}
	
	@GetMapping
	@ResponseStatus(HttpStatus.OK)
	public List<Stocks> findAll(){
		return stocksService.findAll();
	}

	@GetMapping("/{productId}")
	@ResponseStatus(HttpStatus.OK)
	public List<Stocks> findAByProductId(@PathVariable Integer productId){
		return stocksService.findByProductId(productId);
	}
	
}
