package cl.camila.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StoresDTO {

	private Integer storeId;
	private String storeName;
	private String phone;
	private String email;
	private String street;
	private String city;
	private String state;
	private String zipCode;
}
