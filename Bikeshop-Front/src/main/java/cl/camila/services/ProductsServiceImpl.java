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

@Service
public class ProductsServiceImpl implements ProductsService {

	@Value("${endpoints.products}")
	private String productsEndpoint;
	
	@Autowired
	private RestTemplate restTemplate;
	
	@Override
	public List<ProductsDTO> findAll() {
		String url = productsEndpoint;
		
		// create headers
	    HttpHeaders headers = new HttpHeaders();

	    // create request
	    HttpEntity<?> request = new HttpEntity<Object>(headers);
	    
		
	    // make a request
	    ResponseEntity<List<ProductsDTO>> response = restTemplate.exchange(url,
	    		HttpMethod.GET,
	    		request ,
	    		new ParameterizedTypeReference<List<ProductsDTO>>() {}); //que nos retorna la rpta
	    
		return response.getBody();
	}

	
	@Override
	public ProductsDTO findById(Integer id) {
		String url = productsEndpoint + "/" + id;
		HttpHeaders headers = new HttpHeaders();
		HttpEntity<?> request = new HttpEntity<Object>(headers);
		
		ResponseEntity<ProductsDTO> response = restTemplate.exchange(url, 
				HttpMethod.GET,
				request,
				ProductsDTO.class);
		return response.getBody();
	}

		


}
