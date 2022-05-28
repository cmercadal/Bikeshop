package cl.camila.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductStockDTO {
	
	private Integer productId;
	private String productName;
	private Integer stock;
	private Integer brandId;
	private Integer storeId;
	private Integer categoryId;
	private Integer quantity;
	

	public ProductStockDTO(Integer productId, String productName, Integer quantity) {
		this.productId = productId;
		this.productName = productName;
		this.quantity = quantity;

	}
	
	
}


