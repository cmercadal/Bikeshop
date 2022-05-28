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

import cl.camila.dto.CategoryDTO;

@Service
public class CategoriesServiceImpl implements CategoriesService{
	
	@Value("${endpoints.categories}")
	private String categoriesEndpoint;
	
	@Autowired
	private RestTemplate restTemplate;
	

	@Override
	public List<CategoryDTO> findAll() {
		String url = categoriesEndpoint;
		
		// create headers
	    HttpHeaders headers = new HttpHeaders();

	    // create request
	    HttpEntity<?> request = new HttpEntity<Object>(headers);
	    
		
	    // make a request
	    ResponseEntity<List<CategoryDTO>> response = restTemplate.exchange(url,
	    		HttpMethod.GET,
	    		request ,
	    		new ParameterizedTypeReference<List<CategoryDTO>>() {}); //que nos retorna la rpta
	    
		return response.getBody();
	}

	@Override
	public CategoryDTO findById(Integer id) {
		String url = categoriesEndpoint + "/" + id;
		HttpHeaders headers = new HttpHeaders();
		HttpEntity<?> request = new HttpEntity<Object>(headers);
		
		ResponseEntity<CategoryDTO> response = restTemplate.exchange(url, 
				HttpMethod.GET,
				request,
				CategoryDTO.class);
		return response.getBody();
	}

}
