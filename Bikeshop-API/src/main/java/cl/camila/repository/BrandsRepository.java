package cl.camila.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cl.camila.model.Brands;

@Repository
public interface BrandsRepository extends JpaRepository<Brands, Integer> {

}
