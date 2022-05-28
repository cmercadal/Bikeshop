package cl.camila.controller;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import cl.camila.dto.BrandsDTO;
import cl.camila.dto.BusquedaDTO;
import cl.camila.dto.CategoryDTO;
import cl.camila.dto.ProductStockDTO;
import cl.camila.dto.ProductsDTO;
import cl.camila.dto.StocksDTO;
import cl.camila.dto.StoresDTO;
import cl.camila.services.BrandsService;
import cl.camila.services.CategoriesService;
import cl.camila.services.ProductsService;
import cl.camila.services.StocksService;
import cl.camila.services.StoresService;



@Controller
public class HomeController {
	
	@Autowired
	StoresService storesService;
	
	@Autowired
	CategoriesService categoriesService;
	
	@Autowired
	BrandsService brandsService;
	
	@Autowired
	ProductsService productsService;
	
	@Autowired
	StocksService stocksService;
	
	@GetMapping("/home")
	public ModelAndView home() {

		ModelAndView modelAndView = new ModelAndView("home");
		
		List<StoresDTO> stores = storesService.findAll();
		List<CategoryDTO> categories = categoriesService.findAll();
		List<BrandsDTO> brands = brandsService.findAll();
		
		stores.sort(Comparator.comparing(StoresDTO::getStoreName));
		categories.sort(Comparator.comparing(CategoryDTO::getCategoryName));
		brands.sort(Comparator.comparing(BrandsDTO::getBrandName));
		
		
		modelAndView.addObject("stores", stores);
		modelAndView.addObject("categories",categories);
		modelAndView.addObject("brands",brands);
		modelAndView.addObject("products",productsService.findAll());

		return modelAndView;
	}
	

	
	@PostMapping("/listar")
	public ModelAndView buscar(Model model,@ModelAttribute("busqueda") BusquedaDTO busqueda){ //o @RequestBody¿?
			
		ModelAndView modelAndView = new ModelAndView("listar");


		Integer storeId = busqueda.getStoreId();
		Integer categoryId = busqueda.getCategoryId();
		Integer brandId = busqueda.getBrandId();
		List<ProductsDTO> productos = productsService.findAll();
		
		
		List<ProductStockDTO> productosEncontrados = new ArrayList<ProductStockDTO>();

		for (ProductsDTO product : productos) {
			if ((product.getBrandId() == brandId) && (product.getCategoryId() == categoryId)) {
				List<StocksDTO> stocks = stocksService.findAByProductId(product.getProductId());
				for (StocksDTO stock : stocks) {
					if (stock.getStoreId() == storeId){
						productosEncontrados.add(new ProductStockDTO(product.getProductId(),product.getProductName(), stock.getQuantity()));
					}
				}
			}
		}
		
		String storeName = "";
		for (StoresDTO store : storesService.findAll()) {
			if (store.getStoreId() == storeId) {
				storeName = store.getStoreName();
			}
		}
		

		modelAndView.addObject("productosStock", productosEncontrados);	
		modelAndView.addObject("store", storeName);	
		
		
		//Aquí vuelvo a incluir los parametros para hacer una nueva búsqueda junto a la tabla desplegada
		
		List<StoresDTO> stores = storesService.findAll();
		List<CategoryDTO> categories = categoriesService.findAll();
		List<BrandsDTO> brands = brandsService.findAll();
		
		stores.sort(Comparator.comparing(StoresDTO::getStoreName));
		categories.sort(Comparator.comparing(CategoryDTO::getCategoryName));
		brands.sort(Comparator.comparing(BrandsDTO::getBrandName));
		
		modelAndView.addObject("stores", stores);
		modelAndView.addObject("categories",categories);
		modelAndView.addObject("brands",brands);
		

		return modelAndView;		
	}
	
	

	

	
	

}
