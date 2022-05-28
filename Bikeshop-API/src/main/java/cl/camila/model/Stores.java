package cl.camila.model;

import java.io.Serializable;

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
public class Stores implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY) //tabla  con AUTO_INCREMENT en MySQL
	private Integer storeId;
	
	@Column(name = "store_name")
	private String storeName;
	private String phone;
	private String email;
	private String street;
	private String city;
	private String state;
	
	@Column(name = "zip_code")
	private String zipCode;
	

}
