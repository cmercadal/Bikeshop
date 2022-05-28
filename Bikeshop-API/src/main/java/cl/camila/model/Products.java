package cl.camila.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Products {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer productId;
	private String productName;
	private Integer brandId;
	private Integer categoryId;
	@Column(columnDefinition = "SMALLINT") //aquí se pone el tipo de dato de la tabla. Se puede cambiar el nomnre tb: name = "model_year")
	private int modelYear;
	@Column(precision=10, scale=2, columnDefinition = "DECIMAL(19,0)")
	private float list_price;
	
	
}
