package cl.camila.model;

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
public class Brands {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer brandId;
	private String brandName;

}
