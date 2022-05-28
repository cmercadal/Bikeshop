package cl.camila.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BusquedaDTO {
	
	private Integer storeId;
	private Integer categoryId;
	private Integer brandId;

}
