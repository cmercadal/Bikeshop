package cl.camila.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StocksDTO {
	

	private Integer storeId;
	private Integer productId;
	private int quantity;

}
