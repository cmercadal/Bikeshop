package cl.camila.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductsDTO {

	private Integer productId;
	private String productName;
	private Integer brandId;
	private Integer categoryId;
	private int modelYear;
	private float list_price;
}
