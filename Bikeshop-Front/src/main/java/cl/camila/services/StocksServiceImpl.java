package cl.camila.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import cl.camila.dto.ProductsDTO;
import cl.camila.dto.StocksDTO;

@Service
public class StocksServiceImpl implements StocksService{
	
	@Value("${endpoints.stocks}")
	private String stocksEndpoint;
	
	@Autowired
	private RestTemplate restTemplate;

	@Override
	public List<StocksDTO> findAll() {
		String url = stocksEndpoint;
		
		// create headers
	    HttpHeaders headers = new HttpHeaders();

	    // create request
	    HttpEntity<?> request = new HttpEntity<Object>(headers);
	    
		
	    // make a request
	    ResponseEntity<List<StocksDTO>> response = restTemplate.exchange(url,
	    		HttpMethod.GET,
	    		request ,
	    		new ParameterizedTypeReference<List<StocksDTO>>() {}); //que nos retorna la rpta
	    
		return response.getBody();
	}

	@Override
	public List<StocksDTO> findAByProductId(Integer productId) {
		String url = stocksEndpoint + "/" + productId;
		HttpHeaders headers = new HttpHeaders();
		HttpEntity<?> request = new HttpEntity<Object>(headers);
		
		ResponseEntity<List<StocksDTO>>response = restTemplate.exchange(url, 
				HttpMethod.GET,
				request,
				new ParameterizedTypeReference<List<StocksDTO>>() {});
		return response.getBody();
	}

}
