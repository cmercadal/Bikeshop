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

import cl.camila.dto.StoresDTO;

@Service
public class StoresServiceImpl implements StoresService {
	
	@Value("${endpoints.stores}")
	private String storesEndpoint;
	
	@Autowired
	private RestTemplate restTemplate;

	@Override
	public List<StoresDTO> findAll() {
		String url = storesEndpoint;
		
		// create headers
	    HttpHeaders headers = new HttpHeaders();

	    // create request
	    HttpEntity<?> request = new HttpEntity<Object>(headers);
	    
		
	    // make a request
	    ResponseEntity<List<StoresDTO>> response = restTemplate.exchange(url,
	    		HttpMethod.GET,
	    		request ,
	    		new ParameterizedTypeReference<List<StoresDTO>>() {}); //que nos retorna la rpta
	    
		return response.getBody();
	}

	@Override
	public StoresDTO findById(Integer id) {
		String url = storesEndpoint + "/" + id;
		HttpHeaders headers = new HttpHeaders();
		HttpEntity<?> request = new HttpEntity<Object>(headers);
		
		ResponseEntity<StoresDTO> response = restTemplate.exchange(url, 
				HttpMethod.GET,
				request,
				StoresDTO.class);
		return response.getBody();
	}
	
	

}
