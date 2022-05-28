package cl.camila.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cl.camila.model.Products;

@Repository
public interface ProductsRepository extends JpaRepository<Products, Integer> {


}
