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

import cl.camila.dto.BrandsDTO;

@Service
public class BrandsServiceImpl implements BrandsService {

	@Value("${endpoints.brands}")
	private String brandsEndpoint;
	
	@Autowired
	private RestTemplate restTemplate;
	
	@Override
	public List<BrandsDTO> findAll() {
		String url = brandsEndpoint;
		
		// create headers
	    HttpHeaders headers = new HttpHeaders();

	    // create request
	    HttpEntity<?> request = new HttpEntity<Object>(headers);
	    
		
	    // make a request
	    ResponseEntity<List<BrandsDTO>> response = restTemplate.exchange(url,
	    		HttpMethod.GET,
	    		request ,
	    		new ParameterizedTypeReference<List<BrandsDTO>>() {}); //que nos retorna la rpta
	    
		return response.getBody();
	}

	@Override
	public BrandsDTO findById(Integer brandsId) {
		String url = brandsEndpoint + "/" + brandsId;
		HttpHeaders headers = new HttpHeaders();
		HttpEntity<?> request = new HttpEntity<Object>(headers);
		
		ResponseEntity<BrandsDTO> response = restTemplate.exchange(url, 
				HttpMethod.GET,
				request,
				BrandsDTO.class);
		return response.getBody();
	}

}
